package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    EditText etSurname;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etSurname=findViewById(R.id.etSurname);
        btnSubmit=findViewById(R.id.btnSubmit);
    }
}