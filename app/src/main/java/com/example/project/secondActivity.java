package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class secondActivity {


    public class secondActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView((R.layout.secondactivity));
            Button button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(secondActivity.this, MainActivity.class);
                    intent.putExtra("name", "Daniel"); // Optional
                    intent.putExtra("number", 1); // Optional
                    startActivity(intent);



                }
            });
        }
    }


