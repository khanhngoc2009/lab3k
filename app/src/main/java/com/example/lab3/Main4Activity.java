package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {
    String[] ok = {"Adroid cơ bản", "Androi năng cao", "Thiết kế giao diện Androi", "Test và triển khai ứng dụng Android", "NodeJS", "Game2d", "Adroid cơ bản", "Androi năng cao", "Thiết kế giao diện Androi", "Test và triển khai ứng dụng Android", "NodeJS", "Game2d", "Adroid cơ bản", "Androi năng cao", "Thiết kế giao diện Androi", "Test và triển khai ứng dụng Android", "NodeJS", "Game2d", "Adroid cơ bản", "Androi năng cao", "Thiết kế giao diện Androi", "Test và triển khai ứng dụng Android", "NodeJS", "Game2d"
    };
    ListView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lvList = findViewById(R.id.lvList);
        ArrayAdapter<String> arrayok = new ArrayAdapter<>(Main4Activity.this, android.R.layout.simple_list_item_1, ok);
        lvList.setAdapter(arrayok);
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("KQ", ok[position]);
            }
        });


    }
}
