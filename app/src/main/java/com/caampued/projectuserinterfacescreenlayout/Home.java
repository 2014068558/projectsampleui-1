package com.caampued.projectuserinterfacescreenlayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button Help;
    Button Play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        callHelp();
        callCategory();
    }







    public void callHelp() {
        Help = (Button) findViewById(R.id.Help);
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoHelp = new Intent(Home.this, Help.class);
                startActivity(gotoHelp);

            }
        });
    }

    public void callCategory(){
        Play = (Button) findViewById(R.id.Play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoCategory = new Intent(Home.this, Category.class);
                startActivity(gotoCategory);
            }
        });
    }
}
