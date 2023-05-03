package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences myPreferenceRef = getSharedPreferences("MyPreferencesName", MODE_PRIVATE);
        SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();
        myPreferenceRef = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();


        TextView snygg;


            super.onCreate(savedInstanceState);
            setContentView((R.layout.secondactivity));
            snygg = findViewById(R.id.sahib);

            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String name = extras.getString("name");
                int number = extras.getInt("number");
                // Do something with the name and number

                snygg.setText(name + number);



        }
        }

}
