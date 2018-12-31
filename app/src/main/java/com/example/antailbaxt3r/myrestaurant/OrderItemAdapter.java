package com.example.antailbaxt3r.myrestaurant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class OrderItemAdapter extends RecyclerView.Adapter<OrderItemAdapter.ViewHolder> {


    private String[] mOrderItemNames;
    private String[] mOrderItemPrices;
    private Context mOrderContext;

    public OrderItemAdapter(String[] mOrderItemNames, String[] mOrderItemPrices, Context mOrderContext) {
        this.mOrderItemNames = mOrderItemNames;
        this.mOrderItemPrices = mOrderItemPrices;
        this.mOrderContext = mOrderContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.order_item_layout, viewGroup, false);
        OrderItemAdapter.ViewHolder holder = new OrderItemAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.orderItemName.setText(mOrderItemNames[i]);
        viewHolder.orderItemPrice.setText(mOrderItemPrices[i]);

    }

    @Override
    public int getItemCount() {
        return mOrderItemNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       TextView orderItemName;
       TextView orderItemPrice;
       LinearLayout order_items_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            orderItemName = itemView.findViewById(R.id.orderItemTV);
            orderItemPrice = itemView.findViewById(R.id.orderPriceTV);
            order_items_layout = itemView.findViewById(R.id.order_parent_layout);
        }
    }
}
