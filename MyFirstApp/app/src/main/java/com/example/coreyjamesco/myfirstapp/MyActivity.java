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

    public void translateNP(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Normalized Power® (NP®) is an estimate of the power that you could have maintained for the same physiological cost if your power had been perfectly constant instead of variable.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateVI(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Variability Index (VI) is the measure of how smooth or evenly paced your power output was during a workout. VI is the ratio of normalized power to average power.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateEF(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Efficiency Factor (EF) is a good measure of your aerobic fitness. By comparing the numbers for similar workouts over several weeks you can measure improvements in aerobic efficiency. If you are making good aerobic progress then your EF will rise over the course of a few weeks. For pace sports, like running, EF is the ratio of normalized graded pace to average heart rate. For sports power sports, like cycling, EF is the ratio of normalized power to average heart rate.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateWkg(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Watts Per Kilogram (W/kg) is a great indicator of your ability to perform in hilly terrain and long climbs. W/kg is the ratio of average power in watts to body mass in kilograms.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translatePwrBal(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Power Balance Right is the percentage of power contributed by the right leg to the total power output.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateNGP(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Normalized Graded Pace (NGP) is your adjusted pace that reflects the changes in grade and intensity that contribute to the physiological cost of running on varied terrain.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateWork(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Work is the energy transferred to the bike in the form of kilojoules. It is generally accepted in cycling that kilojoules and calories conveniently convert in a 1:1 ratio.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translatePaPwHr(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Aerobic Decoupling is the comparison of the efficiency factors for the two halves of the selected interval. If your aerobic decoupling is consistently 5% or less for steady-state aerobic intervals then your aerobic fitness is good.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateVAM(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "VAM is your average rate of elevation gain in meters per hour. VAM is the abbreviation for the Italian term velocità ascensionale media.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
