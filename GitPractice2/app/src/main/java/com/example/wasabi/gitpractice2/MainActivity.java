package com.example.wasabi.gitpractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actor leo = new Actor("Leonardo DiCaprio", "Nov 11, 1974", "1");
        Actor matt = new Actor("Matt Damon", "Oct 8, 1970", "1");

        ArrayList<Actor> mActorArrayList = new ArrayList<>();
        ActorAdapter adapter = new ActorAdapter(MainActivity.this, mActorArrayList);

        ListView listView = (ListView)findViewById(R.id.LV);
        listView.setAdapter(adapter);
    }
}
