package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_sign_up extends AppCompatActivity {
    private Button btnSignup;
    private TextView btnsignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignup=(Button) findViewById(R.id.btn_signup) ;
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(activity_sign_up.this, activity_sign_in.class);
                startActivity(intent2);
            }
        });
        btnsignin =(TextView) findViewById(R.id.text_signin);
        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(activity_sign_up.this, activity_sign_in.class);
                startActivity(intent3);
            }
        });

    }
}