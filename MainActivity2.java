package com.example.TAB_App;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> listData;
    private ArrayAdapter<String> adapter;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        context= this;
        listView=(ListView) findViewById(R.id.lv);
        listData=new ArrayList<>();
        listData.add("1. BÁN HÀNG");
        listData.add("2. QUẢN LÍ KHO");
        listData.add("3. THỐNG KÊ DOANH THU");
        listData.add("4. THÔNG TIN KHÁCH HÀNG");
        listData.add("5. CÀI ĐẶT APP");

        adapter=new ArrayAdapter<>(context,android.R.layout.simple_list_item_1,listData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(context,listData.get(position),Toast.LENGTH_LONG).show();
                switch (listData.get(position)){
                    case "1. BÁN HÀNG":
                        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(i);
                        break;
                    case "2. QUẢN LÍ KHO":
                        Toast.makeText(MainActivity2.this,"Đang cập nhật",Toast.LENGTH_LONG).show();
                        break;
                    case "3. THỐNG KÊ DOANH THU":
                        break;
                    case "4. THÔNG TIN KHÁCH HÀNG":
                        break;
                    case "5. CÀI ĐẶT APP":
                        break;
                }

            }
        });

    }
}