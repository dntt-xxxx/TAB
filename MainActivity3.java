package com.example.TAB_App;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView lv1;
    ArrayList<Ban> arrayList;
    banAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv1 =(ListView) findViewById(R.id.lvBan);
        arrayList=new ArrayList<>();
        arrayList.add(new Ban("Bàn số 1","Trống",R.drawable.icon_ban));
        arrayList.add(new Ban("Bàn số 2","Trống",R.drawable.icon_ban));
        arrayList.add(new Ban("Bàn số 3","Trống",R.drawable.icon_ban));
        arrayList.add(new Ban("Bàn số 4","Trống",R.drawable.icon_ban));
        arrayList.add(new Ban("Bàn số 5","Trống",R.drawable.icon_ban));
       

        adapter=new banAdapter(this,R.layout.dsban,arrayList);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(i);
            }
        });
    }
}