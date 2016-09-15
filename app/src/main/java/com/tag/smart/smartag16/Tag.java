package com.tag.smart.smartag16;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Jin Jun on 10/11/2015.
 */
public class Tag extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tag);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.Benter) {
            Intent i = new Intent(Tag.this, Tagged.class);
            startActivity(i);
        }
    }
}
