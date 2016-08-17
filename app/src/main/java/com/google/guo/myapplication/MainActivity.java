package com.google.guo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
        for (int i = 0; i <10 ; i++) {
            for(int j=0;j<20;j++){
                Log.d("print", "onCreate: "+i);
                Log.d("print", "onCreate: "+j);
            }

        }
        for (int i = 0; i <10 ; i++) {
            for(int j=0;j<20;j++){
                Log.d("print", "onCreate: "+i);
                Log.d("print", "onCreate: "+j);
            }

        }
        for (int i = 0; i <10 ; i++) {
            for(int j=0;j<20;j++){
                Log.d("print", "onCreate: "+i);
                Log.d("print", "onCreate: "+j);
            }

        }

    }
}
