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

    public void translate(String term) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, term);
        startActivity(intent);
    }

    public void translateAerobic(View view) {
        translate("In the presence of oxygen; aerobic metabolism utilizes oxygen. Below the anaerobic-intensity level.");
    }

    public void translateAnaerobic(View view) {
        translate("Literally, \"without oxygen.\" Exercise that demands more oxygen than the heart and lungs can supply. the intesnity of exercise performed above the lactate threshold.");
    }

    public void translateAnaerobicEndurance(View view) {
        translate("The ability resulting from the combination of speed and endurance allowing the athlete to maintain a high speed for an extended period of time while anaerobic.");
    }

    public void translateAAStrengthPhase(View view) {
        translate("This is the initial phase of strength training that usually occurs in the late fall or early winter during the Preparation period. It\'s purpose is to prepare the muscles and tendons for the greater loads of the maximum strength (MS) phase.");
    }

    public void translateATP(View view) {
        translate("The purpose of an annual training plan is to develop a useful and dynamic guide for your training which will allow you to reach your fitness goals. The ATP includes: season goals, supporting objectives, annual training hours, races and events prioritized (A, B, C), training periods, weekly hours, weekly abilities to be emphasized.");
    }

    public void translateBasePeriod(View view) {
        translate("The period during which the basic abilities of endurance, speed and force are emphasized.");
    }

    public void translateBT(View view) {
        translate("A workout intended to cause a significant, positive, adaptive response. These workouts can take 24+ hours to recover from. Take extra caution with these workouts.");
    }

    public void translateBuildPeriod(View view) {
        translate("The specific preparation mesocycle during which high-intensity training in the form of muscular-endurance, anaerobic-endurance and power are emphasized, force and speed are maintained.");
    }

    public void translateCadence(View view) {
        translate("Revolutions or cycles per minute of the swim stroke, pedal stroke or running stride.");
    }

    public void translateCalendarCompanion(View view) {
        translate("The Calendar Companion is a tool in your TrainingPeaks 3.0 Account that allows you to customize the view of your calendar, such as by viewing two calendars side by side or viewing the Calendar view simultaneously with the Dashboard view.");
    }

    public void translateCriticalPower(View view) {
        translate("The average power a cyclist can maintain for any given duration of time. Critical power can be used as a parameter for training intensity once a rider\\'s CP zones are determined by completing CP field tests. CP zones are expressed as CP followed by the time duration in minutes. Typical CP durations are CP.2 (12-seconds), CP1 (one-minute), CP6, CP12, CP30, CP60, CP90, and CP180.");
    }

    public void translateCrossTraining(View view) {
        translate("Training for more than one sport during the same period of time.");
    }

    public void translateDashboard(View view) {
        translate("The Dashboard view in your TrainingPeaks 3.0 Account displays summary pods of various metrics associated with your training and nutrition over a given time period.");
    }

    public void translateEF(View view) {
        translate("Efficiency Factor (EF) is a good measure of your aerobic fitness. By comparing the numbers for similar workouts over several weeks you can measure improvements in aerobic efficiency. If you are making good aerobic progress then your EF will rise over the course of a few weeks. For pace sports, like running, EF is the ratio of normalized graded pace to average heart rate. For sports power sports, like cycling, EF is the ratio of normalized power to average heart rate.");
    }

    public void translateEndurance(View view) {
        translate("The ability to persist, to resist fatigue.");
    }

    public void translateForce(View view) {
        translate("The strength evident in a muscle or muscle group while exerting against a resistance.");
    }

    public void translateFormSprints(View view) {
        translate("Sprints meant for form not for absolute speed. Do these with a tail wind or slight downhill. Each sprint lasts about 15 seconds with five-minute recoveries. heart rate is not an accurate gauge. Stand for 10 seconds smooth on the pedals building leg strength followed by 5 seconds seated maintaining a high cadence.");
    }

    public void translateFrequency(View view) {
        translate("The number of times per week that one trains.");
    }

    public void translateHRTrainingZones(View view) {
        translate("The Heart rate training zones used on TrainingPeaks.com are based on the athlete\'s lactate threshold heart rate (LTHR). Once the LTHR is determined the five zones can be created by using the \'HR & Power Zones\" page calculator found under the Home page. Here is a short description of each zone:\n1-Recovery\n2-Extensive endurance\n3-Intensive endurance/muscular endurance\n4-Sub-threshold\n5a-Super-threshold\n5b-Anaerobic endurance\n5c-Power");
    }

    public void translateHoods(View view) {
        translate("On drop handelbars, the covers of the brake handles.");
    }

    public void translateIF(View view) {
        translate("Intensity Factor® (IF) is an indication of how hard or difficult a ride was in relation to your overall fitness. IF® values are calculated by taking your Normalized Power® (NP) and dividing it by your Functional Threshold Power (FTP).");
    }

    public void translateIntensity(View view) {
        translate("The qualitative element of training referring to effort, velocity, maximum strength and power.");
    }

    public void translateIntervalTraining(View view) {
        translate("A system of high-intensity work marked by short, but regularly repeated periods of hard exercise interspersed with periods of recovery.");
    }

    public void translateILT(View view) {
        translate("Pedaling with one leg to improve technique.");
    }

    public void translateLT(View view) {
        translate("The point during exercise of increasing intensity at which blood lactate begins to accumulate above resting levels. Also known as anaerobic threshold.");
    }

    public void translateLactate(View view) {
        translate("Formed when lactic acid from the muscles enters the blood stream.");
    }

    public void translateLacticAcid(View view) {
        translate("A by-product of the lactic acid system resulting from the incomplete breakdown of glucose (sugar) in the production of energy.");
    }

    public void translateMacronutrient(View view) {
        translate("The large category of food, which can be broken down into carbohydrates, fat, protein, and fiber.");
    }

    public void translateMash(View view) {
        translate("To push a big gear.");
    }

    public void translateMS(View view) {
        translate("The purpose of this phase of strength training is to improve force generation and the ability to teach the central nervous system to easily recruit high numbers of muscle fibers.");
    }

    public void translateMesocycle(View view) {
        translate("A period of training generally two to six weeks long.");
    }

    public void translateMicrocycle(View view) {
        translate("A period of training of approximately one week.");
    }

    public void translateME(View view) {
        translate("The ability of a muscle or muscle group to perform repeated contractions for a long period of time while bearing a load.");
    }

    public void translateNP(View view) {
        translate("Normalized Power® (NP®) is an estimate of the power that you could have maintained for the same physiological cost if your power had been perfectly constant instead of variable.");
    }

    public void translateNPG(View view) {
        translate("Normalized Graded Pace (NGP) is your adjusted pace that reflects the changes in grade and intensity that contribute to the physiological cost of running on varied terrain.");
    }

    public void translateOverreaching(View view) {
        translate("Training above the work load that would produce overtraining if continued long enough.");
    }

    public void translateOvertraining(View view) {
        translate("Extreme fatigue, both physical and mental, caused by extensively training at a work load higher than that to which the body can readily adapt.");
    }

    public void translatePAHR(View view) {
        translate("Aerobic Decoupling is the comparison of the efficiency factors for the two halves of the selected interval. If your aerobic decoupling is consistently 5% or less for steady-state aerobic intervals then your aerobic fitness is good.");
    }















    /** Called when the user clicks the Send button */
    public void translateTSS(View view) {
        translate("Training Stress Score (TSS) is a composite number that takes into account the duration and intensity of a workout to arrive at a single estimate of the overall training load and physiological stress created by that training session.");

    }

    public void translateIFDDD(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        /**Button buttonText = (Button) findViewById(R.id.tp_tss);*/
        String message = "Intensity Factor® (IF) is an indication of how hard or difficult a ride was in relation to your overall fitness. IF® values are calculated by taking your Normalized Power® (NP) and dividing it by your Functional Threshold Power (FTP).";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void translateNadfasP(View view) {
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
