package com.example.antailbaxt3r.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import java.lang.reflect.Array;


public class HomePage extends AppCompatActivity {

    CardView menu;
    CardView tables;
    CardView about;
    CardView contact;
    CardView delivery;
    CardView rating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        menu = findViewById(R.id.menu_btn);
        tables = findViewById(R.id.tables_btn);
        about = findViewById(R.id.aboutus_btn);
        contact = findViewById(R.id.contact_btn);
        delivery = findViewById(R.id.delivery_btn);
        rating = findViewById(R.id.rating_btn);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Menu.class);
                startActivity(intent);
            }
        });

        tables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Menu.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Order.class);
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Contact.class);
                startActivity(intent);
            }
        });

        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Rating.class);
                startActivity(intent);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomePage.this, Delivery.class);
                startActivity(intent);
            }
        });
    }
}
