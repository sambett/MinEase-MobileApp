package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }
    //create a public method with the name
    // I specified in the android:onClick attribute
    public void onJoinButtonClicked(View view) {
        // current context-->target activity class
        Intent intent = new Intent(this, Login_Sub.class);
        //adding an animation or transition effect
        //by overriding the startActivity
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);

    }



}