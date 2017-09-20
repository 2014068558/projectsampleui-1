package com.caampued.projectuserinterfacescreenlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    Button SciG;
    Button AniG;
    Button HisG;
    Button PeepsG;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        gotoHome();
        gotoGameviaSci();
        gotoGameviaHis();
        gotoGameviaAni();
        gotoGameviapeeps();
    }


    public void gotoHome() {
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoHome = new Intent(Category.this, Home.class);
                startActivity(gotoHome);
            }
        });
    }

    public void gotoGameviaSci() {

        SciG = (Button) findViewById(R.id.SciG);
        SciG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoGameviaSci = new Intent(Category.this, Game.class);
                startActivity(gotoGameviaSci);
            }
        });

    }

    public void gotoGameviaAni() {

        AniG = (Button) findViewById(R.id.AniG);
        AniG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotogameviaAni = new Intent(Category.this, Game.class);
                startActivity(gotogameviaAni);
            }
        });
    }

    public void gotoGameviaHis() {

        HisG = (Button) findViewById(R.id.HisG);
        HisG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoGameviaHis = new Intent(Category.this, Game.class);
                startActivity(gotoGameviaHis);
            }
        });

    }

    public void gotoGameviapeeps() {

        PeepsG = (Button) findViewById(R.id.PeepsG);
        PeepsG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoGameviaPeeps = new Intent(Category.this, Game.class);
                startActivity(gotoGameviaPeeps);
            }
        });

    }
}