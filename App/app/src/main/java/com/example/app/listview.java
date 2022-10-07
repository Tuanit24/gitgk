package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class listview extends AppCompatActivity {


    ListView lvdtor;
    ArrayList<doctors> arraydoctors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lvdtor = (ListView) findViewById(R.id.listviewdoctors);
        arraydoctors = new ArrayList<doctors>();

        arraydoctors.add(new doctors("Mundon","Gynecologist and surgeon",R.drawable.doc_1));
        arraydoctors.add(new doctors("Mundon","Gynecologist and surgeon",R.drawable.doc_2));
        arraydoctors.add(new doctors("Mundon","Gynecologist and surgeon",R.drawable.doc_3));
        arraydoctors.add(new doctors("Mundon","Gynecologist and surgeon",R.drawable.doc_1));
        arraydoctors.add(new doctors("Mundon","Gynecologist and surgeon",R.drawable.doc_1));

        doctors_adapter anAdapter = new doctors_adapter(
                listview.this,
                R.layout.dong_doctors,
                arraydoctors
        );
        lvdtor.setAdapter(anAdapter);
        lvdtor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(listview.this,detail.class);
                startActivity(intent);
            }
        });
    }
}