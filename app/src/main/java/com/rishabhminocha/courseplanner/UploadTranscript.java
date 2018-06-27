package com.rishabhminocha.courseplanner;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rkminoch on 22/06/18.
 */

public class UploadTranscript extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_transcript);
        TextView futureCourses = (TextView) findViewById(R.id.futureCourses);
        futureCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This feature is under development", Toast.LENGTH_LONG).show();
            }
        });
    }
}
