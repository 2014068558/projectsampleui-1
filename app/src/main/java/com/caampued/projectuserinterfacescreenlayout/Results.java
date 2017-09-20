package com.caampued.projectuserinterfacescreenlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Results extends AppCompatActivity {

    Button PlayAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        gotoHome();
    }

    public void gotoHome() {
        PlayAgain = (Button) findViewById(R.id.PlayAgain);
        PlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoCategory = new Intent(Results.this, Category.class);
                startActivity(gotoCategory);
            }
        });
    }

}


