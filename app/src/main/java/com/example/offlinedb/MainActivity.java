package com.example.offlinedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSave,btnView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btn_save);
        btnView=findViewById(R.id.btn_view);



//        btnSave.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                String id=etId.getText().toString();
////                String name=etName.getText().toString();
////                String email=etEmail.getText().toString();
////
////                if (id.isEmpty())
////                {
////                    etId.setError("Please input your id");
////                    etId.requestFocus();
////                }
////
////                else if(name.isEmpty())
////                {
////                    etName.setError("Please input your name");
////                    etName.requestFocus();
////                }
////                else if(email.isEmpty()|| !email.contains("@")|| !email.contains("."))
////                {
////                    etEmail.setError("Please input valid email");
////                    etEmail.requestFocus();
////                }
////                else
////                {
////                    boolean check =dbHelper.insertData(id,name,email);
////                    if(check==true)
////                    {
////                        Toast.makeText(MainActivity.this, "Data Insert Successfully", Toast.LENGTH_SHORT).show();
////                    }
////                    else
////                    {
////                        Toast.makeText(MainActivity.this, "Data insert fail", Toast.LENGTH_SHORT).show();
////                    }
////                }
////            }
////        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);





            }
        });


        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);





            }
        });
    }
    }
