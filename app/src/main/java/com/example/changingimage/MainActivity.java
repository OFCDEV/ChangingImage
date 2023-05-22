package com.example.changingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void newCat(View view){

        Log.i("Info", "Button Pressed");
        ImageView image = (ImageView) findViewById(R.id.catImage);
        image.setImageResource(R.drawable.download);
        //image.setImageResource(R.drawable.newimage);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}