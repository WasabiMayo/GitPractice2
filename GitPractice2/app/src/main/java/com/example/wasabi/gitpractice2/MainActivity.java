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
        Actor jennifer = new Actor("Jennifer Lawrence", "Aug 15, 1990", "1");

        ArrayList<Actor> actorsList = new ArrayList<>();
        actorsList.add(leo);
        actorsList.add(matt);
        actorsList.add(jennifer);

        ActorAdapter adapter = new ActorAdapter(MainActivity.this, actorsList);

        ListView listView = (ListView)findViewById(R.id.LV);
        listView.setAdapter(adapter);
    }
}
