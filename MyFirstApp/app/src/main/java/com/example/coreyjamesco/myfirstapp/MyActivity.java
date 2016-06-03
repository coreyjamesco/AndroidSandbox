package com.example.coreyjamesco.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MyActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.coreyjamesco.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void translateTSS(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        /**Button buttonText = (Button) findViewById(R.id.tp_tss);*/
        String message = "Training Stress Score (TSS) is a composite number that takes into account the duration and intensity of a workout to arrive at a single estimate of the overall training load and physiological stress created by that training session.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateIF(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        /**Button buttonText = (Button) findViewById(R.id.tp_tss);*/
        String message = "Intensity Factor® (IF) is an indication of how hard or difficult a ride was in relation to your overall fitness. IF® values are calculated by taking your Normalized Power® (NP) and dividing it by your Functional Threshold Power (FTP).";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
