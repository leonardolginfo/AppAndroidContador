package com.example.appcontapessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtNumberPeaple;
        Button btnCountMen;
        Button btnCountWomen;

        txtNumberPeaple = findViewById(R.id.textNumberpeaple);
        btnCountMen = findViewById(R.id.btnMasc);
        btnCountWomen = findViewById(R.id.btnFem);

    }
}