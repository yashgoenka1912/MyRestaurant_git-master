package com.example.antailbaxt3r.myrestaurant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Delivery extends AppCompatActivity {


    EditText et1;
    EditText et2;
    EditText et3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


         et1= findViewById(R.id.et3);
         et2= findViewById(R.id.et2);
         et3= findViewById(R.id.et3);
         btn1= findViewById(R.id.btn1);

         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(Delivery.this, "We are revamping our systems, this option isn't available", Toast.LENGTH_SHORT).show();
             }
         });



    }
}