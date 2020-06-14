package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent i = getIntent();
        String ketqua = i.getExtras().getString("KQ","");
        kq = findViewById(R.id.textView2);
        kq.setText(ketqua);
    }

}
