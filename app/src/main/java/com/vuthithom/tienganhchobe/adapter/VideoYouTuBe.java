package com.vuthithom.tienganhchobe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.vuthithom.tienganhchobe.R;
import com.vuthithom.tienganhchobe.model.Item_YouTuBe;

import java.util.List;

/**
 * Created by vuthithom on 4/9/2018.
 */

public class VideoYouTuBe extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Item_YouTuBe> videoList;

    public VideoYouTuBe(Context context, int layout, List<Item_YouTuBe> videoList) {
        this.context = context;
        this.layout = layout;
        this.videoList = videoList;
    }

    @Override
    public int getCount() {
        return videoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.texttitle);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageThuml);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Item_YouTuBe video = videoList.get(position);
        viewHolder.textView.setText(video.getTitle());

        Picasso.with(context).load(video.getThumbnail()).into(viewHolder.imageView);


        return convertView;
    }
}
