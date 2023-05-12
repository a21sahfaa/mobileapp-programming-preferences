package com.example.project;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("onresumemain1", "onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.prefButton);
        textView = findViewById(R.id.prefText);
        myPreferenceRef = getSharedPreferences("ref", MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onResume() {
        Log.d("onresumemain2", "onResume()");
        super.onResume();
        String savedText = myPreferenceRef.getString("savepref", "not found");
        textView.setText(savedText);
    }
}


