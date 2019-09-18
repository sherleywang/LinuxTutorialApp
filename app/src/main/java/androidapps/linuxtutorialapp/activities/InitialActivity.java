package androidapps.linuxtutorialapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidapps.linuxtutorialapp.FolderTreeTests;
import androidapps.linuxtutorialapp.R;

public class InitialActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_activity);

        SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE); // No other app can access our files

        boolean seenWelcomeScreen = prefs.getBoolean("welcomePassed", false);

        if (seenWelcomeScreen) {
            Log.d("WELCOME SCR", "TRUE");
        } else {
            Log.d("WELCOME SCR", "FALSE, WRITING TRUE");
            prefs.edit()
                    .putBoolean("welcomePassed", true)
                    .apply();
        }

        // FolderTreeTests ftt = new FolderTreeTests();
        // ftt.testOne();

        if (!seenWelcomeScreen) {
            Intent myIntent = new Intent(InitialActivity.this, welcome_screen.class);
            myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(myIntent);
        } else {
            /*Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });*/
        }

    }
}