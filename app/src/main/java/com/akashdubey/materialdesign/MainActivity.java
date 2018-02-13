package com.akashdubey.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    //creating view objects

    Toolbar toolbar;
    RecyclerView recyclerView;
    public static String [] androOs;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //binding objects  to views
        recyclerView=(RecyclerView)findViewById(R.id.listRV);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        fab=(FloatingActionButton)findViewById(R.id.fabBtn);

        //setting up toolbar titile
        toolbar.setTitle("Android version ");

        //Set a Toolbar to act as the ActionBar for this Activity window.
        setSupportActionBar(toolbar);

        //telling recyclerView to use LinearlayoutManager to show items in linear order
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        androOs= new String[]{"Alpha", "Beta", "CupCake", "Donut", "Eclair", "Froyo", "Jellybean", "Kitkat", "Lollipop", "Nougat", "Oreo"};


        //creating instance of MyAdapter
        MyAdapter myAdapter= new MyAdapter();

        //setting Adapter for recyclerView
        recyclerView.setAdapter(myAdapter);




    }


    //we inflate options menu here
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }


}
