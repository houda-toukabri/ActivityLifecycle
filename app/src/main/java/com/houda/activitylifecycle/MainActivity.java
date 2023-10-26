package com.houda.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Activity Lifecycle : ";

    /** Appelée à la création de l'activité. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "onCreate()");
    }

    /** Appelée au moment où l'activité est sur le point d'être affichée. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "onStart()");
    }

    /** Appelée lorsque l'activité deviens visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "onResume()");
    }

    /** Appelée lorsque une autre activité est mise au premier plan. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "onPause()");
    }

    /** Appelée lorsque l'activité n'est plus visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "onStop()");
    }

    /** Appelée juste avant la destruction de l'activité. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "onDestroy()");
    }

    /** Appelée au rédémarrage de l'activité. */
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(msg, "onRestart()");
    }

}