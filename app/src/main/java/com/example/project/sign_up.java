package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sign_up extends AppCompatActivity {
    EditText signup_username, signup_email, signup_password;
    TextView loginRedirectText;
    Button signup_button;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");
                String username = signup_username.getText().toString();
                String email = signup_email.getText().toString();
                String password = signup_password.getText().toString();
                HelperClass helperClass = new HelperClass(email,username,password);
                reference.child(username).setValue(helperClass);
                Toast.makeText(sign_up.this, "You have signup successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(sign_up.this, login.class);
                startActivity(intent);
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_up.this, login.class);
                startActivity(intent);
            }
        });
    }

    public void init(){
        signup_username = findViewById(R.id.signup_username);
        signup_email = findViewById(R.id.signup_email);
        signup_password = findViewById(R.id.signup_password);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        signup_button = findViewById(R.id.signup_button);
    }

    //public void onLoginRedirectClick(View view) {
      //  Intent intent = new Intent(this, login.class); // Replace with your login activity class
     //   startActivity(intent);
     //   overridePendingTransition(R.anim.slide_in_right,R.anim.slide_in_left);
  //  }

}