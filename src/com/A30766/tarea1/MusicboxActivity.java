package com.A30766.tarea1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MusicboxActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicbox);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_musicbox, menu);
        return true;
    }
}
