package com.example.jonathanmontanez.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by jonathanmontanez on 4/10/16.
 */
public class Profile extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        TextView f_name = (TextView)findViewById(R.id.fname);
        TextView l_name = (TextView)findViewById(R.id.lname);

//        f_name.setText(users.get(0).getFirst_name());
//        l_name.setText(users.get(0).getLast_name());


    }
}
