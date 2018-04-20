package com.vuthithom.tienganhchobe.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.vuthithom.tienganhchobe.R;

/**
 * Created by vuthithom on 4/9/2018.
 */

public class PlayVideo extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    YouTubePlayerView playerView;
    String id = "";
    int REQUEST_VIDEO = 12;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playmain);
        playerView = findViewById(R.id.mytube);

        Intent intent = getIntent();
        id = intent.getStringExtra("idvideoYoutube");
        playerView.initialize(ActVideo.Aikeyh, PlayVideo.this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo(id);
        youTubePlayer.setFullscreen(true);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(PlayVideo.this, REQUEST_VIDEO);

        } else {
            Toast.makeText(this, "ERROR!!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_VIDEO) {
            playerView.initialize(ActVideo.Aikeyh, PlayVideo.this);
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
