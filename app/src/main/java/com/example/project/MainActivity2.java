package com.example.project;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import org.w3c.dom.Text;
public class MainActivity2 extends AppCompatActivity {
    Button button;
    EditText text;
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        button = findViewById(R.id.prefButton);
        text = findViewById(R.id.settingseditview);
        myPreferenceRef = getSharedPreferences("ref", MODE_PRIVATE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPreferenceEditor = myPreferenceRef.edit();
                myPreferenceEditor.putString("savepref", text.getText().toString());
                myPreferenceEditor.apply();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}