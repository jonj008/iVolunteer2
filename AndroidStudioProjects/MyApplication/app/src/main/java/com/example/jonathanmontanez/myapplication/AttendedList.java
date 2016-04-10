package com.example.jonathanmontanez.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class AttendedList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attended_list);
        Button Backbtn = (Button)findViewById(R.id.Backbtn);
        Backbtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(AttendedList.this, MainActivity.class));
                    }
                }
        );
    }
}