package com.vuthithom.tienganhchobe.main;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.youtube.player.YouTubePlayerView;
import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.adapter.VideoYouTuBe;
import com.vuthithom.tienganhchobe.model.Item_YouTuBe;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by vuthithom on 4/9/2018.
 */

public class ActVideo extends Activity {
    YouTubePlayerView tubePlayerView;
    public static String Aikeyh = "AIzaSyD2pqulsrohVacVllE821MiVOAp1xH1GtQ";
    String Akey_play = "PLBIaEVkVY5x3Cnrse-meKp5cN6geRqnri";
    String urlGetjson = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId=" + Akey_play + "&key=" + Aikeyh + "&maxResults=50";
    ListView lvvideo;
    ArrayList<Item_YouTuBe> list;
    VideoYouTuBe adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_youtube);
        GetJsonYouTube(urlGetjson);
        lvvideo = (ListView) findViewById(R.id.listvideo);
        list = new ArrayList<>();
        adapter = new VideoYouTuBe(this, R.layout.row_youtube, list);
        lvvideo.setAdapter(adapter);
        lvvideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ActVideo.this, PlayVideo.class);
                intent.putExtra("idvideoYoutube", list.get(position).getIdVideo());
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("English for kids")
                .setMessage("Bạn có muốn thoát?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        ActVideo.super.onBackPressed();
                    }
                }).create().show();
    }

    //
    private void GetJsonYouTube(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray jsonItems = response.getJSONArray("items");
                    String title = "";
                    String url = "";
                    String idvideo = "";
                    for (int i = 0; i < jsonItems.length(); i++) {
                        JSONObject jsonItem = jsonItems.getJSONObject(i);
                        JSONObject jsonObject = jsonItem.getJSONObject("snippet");
                        title = jsonObject.getString("title");
                        JSONObject jsonThumball = jsonObject.getJSONObject("thumbnails");
                        JSONObject jsonMedlim = jsonThumball.getJSONObject("medium");
                        url = jsonMedlim.getString("url");
                        JSONObject jsonResourceId = jsonObject.getJSONObject("resourceId");
                        idvideo = jsonResourceId.getString("videoId");
                        list.add(new Item_YouTuBe(title, url, idvideo));
                    }
                    adapter.notifyDataSetChanged();


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(ActVideo.this, "lỗi", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        requestQueue.add(jsonObjectRequest);

    }

}
