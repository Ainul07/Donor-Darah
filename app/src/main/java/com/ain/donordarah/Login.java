package com.ain.donordarah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Login extends AppCompatActivity {
    Button btnLogin, btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


      btnLogin = findViewById(R.id.btnLogin);
      btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent =new Intent(Login.this, SignUp.class);

              startActivity(intent);
          };
      });


    }


}