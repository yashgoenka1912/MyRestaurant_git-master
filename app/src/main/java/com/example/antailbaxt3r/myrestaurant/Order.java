package com.example.antailbaxt3r.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.antailbaxt3r.myrestaurant.OrderClass.orderItems;

public class Order extends AppCompatActivity {

    RecyclerView recyclerView;
    private String[] mOrderItemNames = {" "};
    private String[] mOrderItemPrices = {"0"};
    int total = 0;
    TextView totalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        OrderClass.orderPrice.add("0");
        OrderClass.orderItems.add(" ");

        for(int i = 0; i < OrderClass.orderPrice.size(); i++){

            mOrderItemNames[i] = OrderClass.orderItems.get(i);
            mOrderItemPrices[i] = OrderClass.orderPrice.get(i);
            
        }

        totalPrice = findViewById(R.id.total);

        initRecyclerView();
        getTotal();

        totalPrice.setText(total);


    }

    private void initRecyclerView(){
        RecyclerView recyclerView2 = findViewById(R.id.recyclerViewOrder);
        OrderItemAdapter adapter = new OrderItemAdapter(mOrderItemNames,mOrderItemPrices,this);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getTotal(){

        for(int i = 0; i< OrderClass.orderPrice.size();i++){
            total = total + Integer.parseInt(OrderClass.orderPrice.get(i));
        }
    }
}
