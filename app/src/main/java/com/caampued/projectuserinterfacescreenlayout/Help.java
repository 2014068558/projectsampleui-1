package com.caampued.projectuserinterfacescreenlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity {

    Button PlayfromHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        gamefromHelp();
    }

    public void gamefromHelp () {

        PlayfromHelp = (Button) findViewById(R.id.PlayfromHelp);
        PlayfromHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoGame = new Intent(Help.this, Category.class);
                startActivity(gotoGame);
            }
        });
    }
}
