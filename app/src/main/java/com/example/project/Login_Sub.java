package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Sub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sub);
    }
    // your current activity  has completed its task
    // and should be removed from the back stack.
    //public void finish(){
       // super.finish();
        //depricated but works still
       // overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
    //}
    public void onLoginButtonClicked(View view) {
        // current context-->target activity class
        Intent intent = new Intent(this, login.class);
        //adding an animation or transition effect
        //by overriding the startActivity
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);

    }
    public void onSignButtonClicked(View view) {
        // current context-->target activity class
        Intent intent = new Intent(this, sign_up.class);
        //adding an animation or transition effect
        //by overriding the startActivity
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
    }

}