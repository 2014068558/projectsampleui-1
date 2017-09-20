package com.caampued.projectuserinterfacescreenlayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Game extends AppCompatActivity {

    Button Exit;
    Button Answer1;
    Button Answer2;
    Button Answer3;
    Button Answer4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ExitGame();
        gotoresultviaAns1();
        gotoresultsviaAns2();
        gotoresultviaAns3();
        gotoresultviaAns4();

    }

    public void ExitGame() {
        Exit = (Button) findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoresultviaAns1 = new Intent(Game.this, Prompt.class);
                startActivity(gotoresultviaAns1);
            }
        });

    }


    public void gotoresultviaAns1() {
        Answer1 = (Button) findViewById(R.id.Answer1);
        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoresultviaAns1 = new Intent(Game.this, Results.class);
                startActivity(gotoresultviaAns1);
            }
        });

    }

    public void gotoresultsviaAns2() {
        Answer2 = (Button) findViewById(R.id.Answer2);
        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoresultviaAns2 = new Intent(Game.this, Results.class);
                startActivity(gotoresultviaAns2);
            }
        });
    }

    public void gotoresultviaAns3() {
        Answer3 = (Button) findViewById(R.id.Answer3);
        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoresultviaAns3 = new Intent(Game.this, Results.class);
                startActivity(gotoresultviaAns3);
            }
        });
    }

    public void gotoresultviaAns4() {
        Answer4 = (Button) findViewById(R.id.Answer4);
        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoresultviaAns4 = new Intent(Game.this, Results.class);
                startActivity(gotoresultviaAns4);
            }
        });
    }
}

