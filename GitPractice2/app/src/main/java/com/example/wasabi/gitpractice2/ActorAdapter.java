package com.example.wasabi.gitpractice2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Wasabi on 2/29/2016.
 */
public class ActorAdapter extends ArrayAdapter<String> {

    private ArrayList<Actor> actors;

    public ActorAdapter(Context context, ArrayList<Actor> actors) {
        super(context, -1);
        this.actors = actors;
    }

    @Override
    public int getCount() {
        return actors.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.custom,parent,false);
        TextView nameTV = (TextView)view.findViewById(R.id.TV1);
        TextView dobTV = (TextView)view.findViewById(R.id.TV2);
        TextView oscarTV = (TextView)view.findViewById(R.id.TV3);

        nameTV.setText("Name: "+actors.get(position).getmName());
        dobTV.setText("DOB: "+actors.get(position).getmDOB());
        oscarTV.setText("Oscars won: "+actors.get(position).getmOscar());

        return view;
    }
}
