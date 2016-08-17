package com.google.guo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    List<String> data;
    Myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= (ListView) findViewById(R.id.lv);
        data=new ArrayList<>();
        for(int i=0;i<40;i++){
            String s=">>>"+i;
            data.add(s);
        }
        Intent intent1=new Intent();
        startActivity(intent1);
        Intent intent2=new Intent();
        startActivity(intent2);
        Intent intent3=new Intent();
        startActivity(intent3);
        Intent intent4=new Intent();
        startActivity(intent4);
    }
}
