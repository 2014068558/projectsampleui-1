package com.caampued.projectuserinterfacescreenlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Prompt extends AppCompatActivity {

    Button back;
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);
        backtoGame();
        backtoHome();
    }


    public void backtoHome() {
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoHome = new Intent(Prompt.this, Game.class);
                startActivity(gotoHome);
            }
        });
    }


    public void backtoGame() {
        home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoGame = new Intent(Prompt.this, Home.class);
                startActivity(gotoGame);
            }
        });
    }
}
