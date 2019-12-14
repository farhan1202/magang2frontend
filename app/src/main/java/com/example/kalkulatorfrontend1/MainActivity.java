package com.example.kalkulatorfrontend1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText txta, txtb, txtc, txthasil;
Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta = findViewById(R.id.txtNilai1);
        txtb = findViewById(R.id.txtNilai2);
        txtc = findViewById(R.id.txtNilai3);
        txthasil = findViewById(R.id.txtHasil);

        btn1 = findViewById(R.id.btntambah);
        btn2 = findViewById(R.id.btnkurang);
        btn3 = findViewById(R.id.btnkali);
        btn4 = findViewById(R.id.btnbagi);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btntambah:
                tambah();
                break;
            case R.id.btnkurang:
                kurang();
                break;
            case R.id.btnkali:
                kali();
                break;
            case R.id.btnbagi:
                bagi();
                break;
        }
    }

    private void bagi() {
        if (cek()){
            int a = Integer.parseInt(txta.getText().toString());
            int b = Integer.parseInt(txtb.getText().toString());
            int c = Integer.parseInt(txtc.getText().toString());

            int total = a / b / c;
            txthasil.setText(total+ "");
        }
    }

    private void kali() {
        if (cek()){
            int a = Integer.parseInt(txta.getText().toString());
            int b = Integer.parseInt(txtb.getText().toString());
            int c = Integer.parseInt(txtc.getText().toString());

            int total = a * b * c;
            txthasil.setText(total+ "");
        }
    }

    private void kurang() {
        if (cek()){
            int a = Integer.parseInt(txta.getText().toString());
            int b = Integer.parseInt(txtb.getText().toString());
            int c = Integer.parseInt(txtc.getText().toString());

            int total = a - b - c;
            txthasil.setText(total+ "");
        }
    }

    private void tambah() {
        if (cek()){
            int a = Integer.parseInt(txta.getText().toString());
            int b = Integer.parseInt(txtb.getText().toString());
            int c = Integer.parseInt(txtc.getText().toString());

            int total = a + b + c;
            txthasil.setText(total+ "");
        }

    }

    private boolean cek(){
        if (TextUtils.isEmpty(txta.getText().toString())){
            txta.setError("Tidak Boleh Kosong");
            return false;

        }
        if (TextUtils.isEmpty(txtb.getText().toString())){
            txtb.setError("Tidak Boleh Kosong");
            return false;
        }
        if (TextUtils.isEmpty(txtc.getText().toString())){
            txtc.setError("Tidak Boleh Kosong");
            return false;
        }
        return true;
    }
}
