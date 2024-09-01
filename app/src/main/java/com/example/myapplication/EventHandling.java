package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class EventHandling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_event_handling);

        Button btn=findViewById(R.id.button1);
//adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//displaying message
                Toast.makeText(getApplicationContext(),"Button Clicked !",

                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}