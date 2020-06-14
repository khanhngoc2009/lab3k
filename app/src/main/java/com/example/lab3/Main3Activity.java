package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
TextView userName, passWood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        userName = findViewById(R.id.txt_user);
        passWood = findViewById(R.id.txt_pass);
    }
    public void login(View view){
        String user = userName.getText().toString();
        String pass = passWood.getText().toString();
        if(user.equals("admin")&& pass.equals("admin")){
            Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
        }
    }
}
