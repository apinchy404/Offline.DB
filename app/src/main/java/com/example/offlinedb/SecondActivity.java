package com.example.offlinedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText etId,etName,etEmail;
    Button btnUpdate,btnDelete;
    DBhelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etId = findViewById(R.id.et_id);
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);


        btnUpdate = findViewById(R.id.btn_update);
        btnDelete = findViewById(R.id.btn_delete);

        dbHelper = new DBhelper(SecondActivity.this);
    }


        public void Update(View v)
        {
            String getId=etId.getText().toString().trim();
            String getEmail=etEmail.getText().toString();
            String getName=etName.getText().toString();


            if (getId.isEmpty())
            {
                etId.setError("Please input your id");
                etId.requestFocus();
            }

            else if(getName.isEmpty())
            {
                etName.setError("Please input your name");
                etName.requestFocus();
            }
            else if(getEmail.isEmpty()|| !getEmail.contains("@")|| !getEmail.contains("."))
            {
                etEmail.setError("Please input valid email");
                etEmail.requestFocus();
            }
            else
            {
                boolean check =dbHelper.updatetData(getId,getName,getEmail);
                if(check==true)
                {
                    Toast.makeText(SecondActivity.this, "Data Update Successfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SecondActivity.this, "Data Update fail", Toast.LENGTH_SHORT).show();
                }
            }
        }

        public void delete(View v)
        {
            String id=etId.getText().toString().trim();
            if(id.isEmpty())
            {
                etId.setError("Please input your id");
                etId.requestFocus();
            }
            else
            {
                boolean check=dbHelper.deleteData(id);
                if(check==true)
                {
                    Toast.makeText(SecondActivity.this, "Data Deleted Successfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(SecondActivity.this, "Data Deleted fail", Toast.LENGTH_SHORT).show();
                }

            }

        }
    }


