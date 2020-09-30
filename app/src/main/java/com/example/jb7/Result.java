package com.example.jb7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView nama = (TextView) findViewById(R.id.nama);
        TextView nim = (TextView) findViewById(R.id.nim);
        TextView date = (TextView) findViewById(R.id.ttl);
        TextView gender = (TextView) findViewById(R.id.gender);
        TextView jurusan = (TextView) findViewById(R.id.jurusan);
        Intent intent = getIntent();
        Form form = intent.getParcelableExtra("Form Mhs");

        nama.setText("Nama:" + form.getNama());
        nim.setText("NIM:" + form.getNim());
        date.setText("Date:" + form.getDate());
        gender.setText("Gender:" + form.getGender());
        jurusan.setText("Jurusan:" + form.getJurusan());
    }
}