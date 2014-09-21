package com.example.IdeaToMarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void about(View v)
    {
        Intent i = new Intent(getApplicationContext(), AboutActivity.class);
        startActivity(i);
    }
}
