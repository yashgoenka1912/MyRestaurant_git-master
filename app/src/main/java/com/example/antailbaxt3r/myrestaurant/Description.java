package com.example.antailbaxt3r.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Description extends AppCompatActivity {

    TextView descriptionName;
    TextView descriptionPrice;
    ImageView descriptionImage;
    CardView orderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        descriptionImage = findViewById(R.id.dscrnImage);
        descriptionName = findViewById(R.id.descriptionName);
        descriptionPrice = findViewById(R.id.descriptionPrice);
        orderButton = findViewById(R.id.addToOrder_btn);

        String imageURL = getIntent().getStringExtra("imageURL");
        final String itemName = getIntent().getStringExtra("itemName");
        final String itemPrice = getIntent().getStringExtra("itemPrice");

        descriptionName.setText(itemName);
        descriptionPrice.setText(itemPrice);
        Glide.with(this).load(imageURL).into(descriptionImage);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Description.this, "Added To Order", Toast.LENGTH_SHORT).show();

                OrderClass.orderItems.add(itemName);
                OrderClass.orderPrice.add(itemPrice);


            }
        });
    }

}
