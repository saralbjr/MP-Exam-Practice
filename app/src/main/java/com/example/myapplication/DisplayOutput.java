package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayOutput extends AppCompatActivity {

    EditText edtId, edtName;
    RadioButton radMale, radFemale;
    Spinner spProgram;
    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_output);

        // Initialize Views
        edtId = findViewById(R.id.edtId);
        edtName = findViewById(R.id.edtName);
        radMale = findViewById(R.id.radMale);
        radFemale = findViewById(R.id.radFemale);
        spProgram = findViewById(R.id.spProgram);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);

        // Set OnClickListener for Submit Button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Getting data from EditText
                String id = edtId.getText().toString();
                String name = edtName.getText().toString();

                // Getting data from RadioButtons
                String gender = "";
                if (radMale.isChecked()) {
                    gender = "Male";
                } else if (radFemale.isChecked()) {
                    gender = "Female";
                }

                // Getting data from Spinner
                String program = spProgram.getSelectedItem().toString();

                // Displaying data in TextView
                txtResult.setText("Student Id=" + id + "\n" +
                        "Student Name=" + name + "\n" +
                        "Gender=" + gender + "\n" +
                        "Program=" + program);
            }
        });
    }
}
