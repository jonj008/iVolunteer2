package com.example.jonathanmontanez.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Register extends AppCompatActivity {


    String  truepword="";
    ArrayList<UserClass> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button regBtn = (Button)findViewById(R.id.registerBtn);


        final EditText name = (EditText)findViewById(R.id.nameTxt);
        final EditText lname = (EditText)findViewById(R.id.lnameTxt);
        final EditText username = (EditText)findViewById(R.id.unameTxt);
        final EditText password = (EditText)findViewById(R.id.pwordTxt);
        final EditText pword2 = (EditText)findViewById(R.id.rpwordTxt);
        final EditText orgname = (EditText)findViewById(R.id.orgTxt);




        if(password.getText().toString() == pword2.getText().toString()){

            truepword = pword2.getText().toString();
        }



        regBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(Register.this, Profile.class));

                users.add(new UserClass(name.getText().toString(), lname.getText().toString(), username.getText().toString(), truepword, orgname.getText().toString(), null));
            }
        });






    }
}
