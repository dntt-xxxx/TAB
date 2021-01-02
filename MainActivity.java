package com.example.TAB_App;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtUser;
    TextView txtPassword;
    Button   btnClick;
    String tk= "nvb";
    String mk= "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        txtUser= (TextView) findViewById(R.id.editTextTextUser);
        txtPassword= (TextView) findViewById(R.id.editTextTextPassword);
        btnClick= (Button) findViewById(R.id.button1);
        String taikhoan =txtUser.getText().toString();
        String matkhau=txtPassword.getText().toString();
        btnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               // Intent i = new Intent(MainActivity.this, MainActivity2.class);
                String taikhoan =txtUser.getText().toString();
                String matkhau=txtPassword.getText().toString();

                    //startActivity(i);}

                   // String taikhoan =txtUser.getText().toString();
                   // String matkhau=txtPassword.getText().toString();
                    String tk = "tab";
                    String mk = "123";
                    if(taikhoan.compareTo(tk)==0&&matkhau.compareTo(mk)==0){
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                     startActivity(i);
                                        }
                    else{
                        Toast.makeText(MainActivity.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_LONG).show();

            }}
            }
            );


    }}