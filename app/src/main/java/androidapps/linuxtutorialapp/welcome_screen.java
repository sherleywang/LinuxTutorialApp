package androidapps.linuxtutorialapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("T0", "reeeeeeeeEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button testButton = findViewById(R.id.enter_button);
        testButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("T1", "Testy");
            }
        });

    }

}
