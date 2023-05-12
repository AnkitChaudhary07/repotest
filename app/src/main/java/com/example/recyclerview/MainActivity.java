package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Contact c1 = new Contact(1,"23456543","Amit");
    Contact c2 = new Contact(2,"9876543","Mohit");
    Contact c3 = new Contact(3,"54652536","Rohan");
    Contact c4 = new Contact(4,"343432234","Komal");

    Contact arr[] = {c1,c2,c3,c4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ca = new CustomAdapter(arr);
        recyclerView.setAdapter(ca);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}