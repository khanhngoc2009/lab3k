package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main7Activity extends AppCompatActivity {
EditText edta, edtb, edtc,kq ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        edta = findViewById(R.id.editTextA);
        edtb = findViewById(R.id.editTextB);
        edtc = findViewById(R.id.editTextC);

    }
    public void ketqua(View view){
        Double a = Double.parseDouble(edta.getText().toString());
        Double b = Double.parseDouble(edtb.getText().toString());
        Double c = Double.parseDouble(edtc.getText().toString());
        Double delta = b*b - 4*a*c;
        if(delta < 0){
            String kq = "Phương trình vô nghiệm";
            Intent i = new Intent(this , Main6Activity.class);
            i.putExtra("KQ",kq);
            startActivity(i);
        }else if(delta == 0){
            Double x = -b/2*a;
            String kq = "Phương trình có 1 nghiệm phân biệt:\n x = " + x.toString();
            Intent i = new Intent(this , Main6Activity.class);
            i.putExtra("KQ",kq);
            startActivity(i);
        }else{
            Double x1 = (-b - delta)/2*a;
            Double x2 = (-b + delta)/2*a;
            String kq = "Phương trình đã cho có 2 nghiệm phân biệt:\n x1 = " + x1.toString() +
                    " và x2 = " + x2.toString();
            Intent i = new Intent(this , Main6Activity.class);
            i.putExtra("KQ",kq);
            startActivity(i);
        }
    }
}
