package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app.databinding.ActivityMainBinding;

public class Home extends AppCompatActivity {
    private TextView btnlist;
    private ImageView btnprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnlist =(TextView) findViewById(R.id.btninlist);
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(Home.this, listview.class);
                startActivity(intent3);
            }
        });
        btnprofile =(ImageView) findViewById(R.id.btnpro);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this,Profile.class);
                startActivity(intent);
            }
        });

    }
}