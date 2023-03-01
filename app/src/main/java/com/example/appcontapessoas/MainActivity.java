package com.example.appcontapessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        btnCountMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberMen++;
                numberPeaple++;
                String txtTempNumberPeaple = Integer.toString(numberPeaple);
                txtNumberPeaple.setText(txtTempNumberPeaple);
                btnCountMen.setText(Integer.toString(numberMen));
            }
        });

        btnCountWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberWomen++;
                numberPeaple++;
                String txtTempNumberPeaple = Integer.toString(numberPeaple);
                txtNumberPeaple.setText(txtTempNumberPeaple);
                btnCountWomen.setText(Integer.toString(numberWomen));
            }
        });

        btnResetCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberMen = 0;
                numberWomen = 0;
                numberPeaple = 0;
             txtNumberPeaple.setText(Integer.toString(numberPeaple));
             btnCountMen.setText(Integer.toString(numberMen));
             btnCountWomen.setText(Integer.toString(numberWomen));
            }
        });

    }
}