package com.tag.smart.smartag16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.Blist) {
            Intent i = new Intent(Home.this, list.class);
            startActivity(i);
        }

        else if (v.getId() == R.id.Btag) {
                Intent i = new Intent(Home.this, Tag.class);
                startActivity(i);
            }

        else if (v.getId() == R.id.Bfind) {
                    Intent i = new Intent(Home.this, Find.class);
                    startActivity(i);
                }


    }
}