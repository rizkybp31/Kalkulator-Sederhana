package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inpAngka1 = (EditText) findViewById(R.id.inpAngka1);
        EditText inpAgka2 = (EditText) findViewById(R.id.inpAngka2);
        EditText inpHasil = (EditText) findViewById(R.id.inpHasil);

        Button btnTambah = (Button) findViewById(R.id.btnTambah);
        Button btnKurang = (Button) findViewById(R.id.btnKurang);
        Button btnKali = (Button) findViewById(R.id.btnKali);
        Button btnBagi = (Button) findViewById(R.id.btnBagi);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        Button btnExit = (Button) findViewById(R.id.btnExit);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double angka1, angka2, hasil;
                angka1 = Double.valueOf(inpAngka1.getText().toString());
                angka2 = Double.valueOf(inpAgka2.getText().toString());
                hasil = angka1 + angka2;
                inpHasil.setText(hasil.toString());
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double angka1, angka2, hasil;
                angka1 = Double.valueOf(inpAngka1.getText().toString());
                angka2 = Double.valueOf(inpAgka2.getText().toString());
                hasil = angka1 - angka2;
                inpHasil.setText(hasil.toString());
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double angka1, angka2, hasil;
                angka1 = Double.valueOf(inpAngka1.getText().toString());
                angka2 = Double.valueOf(inpAgka2.getText().toString());
                hasil = angka1 * angka2;
                inpHasil.setText(hasil.toString());
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double angka1, angka2, hasil;
                angka1 = Double.valueOf(inpAngka1.getText().toString());
                angka2 = Double.valueOf(inpAgka2.getText().toString());
                hasil = angka1 / angka2;
                inpHasil.setText(hasil.toString());
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inpAngka1.setText("");
                inpAgka2.setText("");
                inpHasil.setText("");
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    }
}