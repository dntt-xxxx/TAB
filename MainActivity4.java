package com.example.TAB_App;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    GridView gridView;
    ArrayList<menu> arrayList;
    menuAdapter adapter;
    TextView txtsotien;
    int sotien=0;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txtsotien=(TextView) findViewById(R.id.sotien);

        gridView = (GridView) findViewById(R.id.gv);
        arrayList = new ArrayList<>();

        arrayList.add(new menu("Capuchino", R.drawable.capuchino));
        arrayList.add(new menu("Americano", R.drawable.americano));
        arrayList.add(new menu("Lattemachiato", R.drawable.lattemachiato4));
        arrayList.add(new menu("Latte", R.drawable.latte3));
        arrayList.add(new menu("Expreso", R.drawable.epreso3));
        arrayList.add(new menu("Đen đá", R.drawable.denda2));
        arrayList.add(new menu("Bạc xỉu ", R.drawable.bacxiu2));
        arrayList.add(new menu("Tà Tưa", R.drawable.tatua6));

        adapter = new menuAdapter(this, R.layout.menu, arrayList);
        gridView.setAdapter(adapter);
        /*gridView.setOnClickListener(new AdapterView.OnItemClickListener(){
        }
         */

        //gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                           // @Override
                                            //public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                //Toast.makeText(MainActivity4.this, "+1", Toast.LENGTH_LONG).show();
                                                //switch  (arrayList.get(position)){
                                                   // case "Capuchino":
                                                    // sotien+=10;
                                                     //txtsotien.setText(sotien);
                                                    // break;
    }}

    //});
//}}




