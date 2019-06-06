package com.example.registerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mail;
    EditText password;
    String email;
    String passw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mail= findViewById(R.id.email);
        password= findViewById(R.id.pass);
    }
    public void login(View view) {
        email= mail.getText().toString();
        passw= password.getText().toString();



        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Email is required!!!", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(passw)){

            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();

            return;
        }
        if (passw.length()<8){
            password.setError("password length must be greater 6 less than 32");
            return;
        }
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "WELCOME"    , Toast.LENGTH_LONG).show();
    }

    public void register(View view) {
        Intent intent= new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(intent);
    }
}
