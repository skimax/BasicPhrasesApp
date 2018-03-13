package com.skimax.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void ButtonTapped (View view){


        int id = view.getId();

        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = view.getResources()
                .getIdentifier(ourId, "raw", "com.skimax.basicphrasesapp");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();



    }


}
