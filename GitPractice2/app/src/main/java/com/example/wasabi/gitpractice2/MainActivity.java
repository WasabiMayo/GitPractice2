package com.example.wasabi.gitpractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actor leo = new Actor("Leonardo DiCaprio", "Nov 11, 1974", "1");
        Actor matt = new Actor("Matt Damon", "Oct 8, 1970", "1");
        Actor jennifer = new Actor("Jennifer Lawrence", "Aug 15, 1990", "1");
    }
}
