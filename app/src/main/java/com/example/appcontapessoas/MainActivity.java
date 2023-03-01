package com.example.appcontapessoas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int numberMen = 0;
    int numberWomen = 0;
    int numberPeaple = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtNumberPeaple = (TextView) findViewById(R.id.textNumberpeaple);
        Button btnCountMen = (Button) findViewById(R.id.btnMasc);
        Button btnCountWomen = (Button) findViewById(R.id.btnFem);
        Button btnResetCount = (Button) findViewById(R.id.btnReset);

        btnCountMen.setOnClickListener(v -> {
            numberMen++;
            numberPeaple++;
            String txtTempNumberPeaple = Integer.toString(numberPeaple);
            txtNumberPeaple.setText(txtTempNumberPeaple);
            btnCountMen.setText(String.valueOf(numberMen));
        });

        btnCountWomen.setOnClickListener(v -> {
            numberWomen++;
            numberPeaple++;
            String txtTempNumberPeaple = Integer.toString(numberPeaple);
            txtNumberPeaple.setText(txtTempNumberPeaple);
            btnCountWomen.setText(String.valueOf(numberWomen));
        });

        btnResetCount.setOnClickListener(v -> {
            numberMen = 0;
            numberWomen = 0;
            numberPeaple = 0;
         txtNumberPeaple.setText(String.valueOf(numberPeaple));
         btnCountMen.setText(String.valueOf(numberMen));
         btnCountWomen.setText(String.valueOf(numberWomen));
        });

    }
}