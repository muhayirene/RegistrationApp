package com.example.registerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    EditText email;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email1);
        pass = findViewById(R.id.passwd);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Login();


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "CREATE YOUR ACCOUNT!", Toast.LENGTH_SHORT).show();
                Intent reg=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(reg);


            }
        });


    }
    public void Login() {

        String mail = email.getText().toString().trim();
        String password = pass.getText().toString().trim();

        if (mail.isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter your Email Please!", Toast.LENGTH_LONG).show();
        }
        if (password.isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter the Password Please!", Toast.LENGTH_LONG).show();
        }

        if (mail.equals("ibihe@gmail.com") && password.equals("1234")) {
            Toast.makeText(MainActivity.this, "login success!", Toast.LENGTH_LONG).show();
            Intent register = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(register);
        } else {

            Toast.makeText(MainActivity.this, "Invalid email or password", Toast.LENGTH_LONG).show();
        }



    }
}