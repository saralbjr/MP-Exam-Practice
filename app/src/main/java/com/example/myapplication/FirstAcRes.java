package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstAcRes extends AppCompatActivity {
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first_ac_res);
        txt=findViewById(R.id.text1);
        btn=findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(FirstAcRes.this,
                        SecondAcRes.class);

                startActivityForResult(i,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int reqCode, int

            resCode, Intent data)

    {
        super.onActivityResult(reqCode, resCode, data);

        if(reqCode==2)
        {
            String message=data.getStringExtra("message");
            txt.setText(message);
        }
    }
}