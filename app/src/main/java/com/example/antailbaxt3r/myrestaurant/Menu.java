package com.example.antailbaxt3r.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mPrices = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addStuff();
        initRecyclerView();

    }

    private void addStuff(){

        mImageUrls.add("https://d2droglu4qf8st.cloudfront.net/2017/10/351683/Tandoori-Chicken-Tikka-with-Lemon-and-Sage_ArticleImage-CategoryPage_ID-2483977.jpg?v=2483977");
        mNames.add("Chicken Tikka");
        mPrices.add("100");

        mImageUrls.add("http://maunikagowardhan.co.uk/wp-content/uploads/2014/07/Tandoori-Fish-Tikka-1-1024x683.jpg");
        mNames.add("Fish Tikka");
        mPrices.add("120");

        mImageUrls.add("https://www.whiskaffair.com/wp-content/uploads/2016/02/Achari-Paneer-Tikka-2.jpg");
        mNames.add("Paneer Tikka");
        mPrices.add("80");

        mImageUrls.add("https://www.ndtv.com/cooks/images/KERELA.FISH.66%281%29.jpg");
        mNames.add("Fish Fry");
        mPrices.add("125");

        mImageUrls.add("https://d3awvtnmmsvyot.cloudfront.net/api/file/b6yGFw8bTF6pzqWgNPah/convert?fit=max&w=1150&quality=60&cache=true&rotate=exif&compress=true");
        mNames.add("Prawns");
        mPrices.add("180");

        mImageUrls.add("https://www.redlobster.com/images/default-source/images/menu-items/lunch-dinner/live-maine-lobster.jpg?sfvrsn=2&size=1125");
        mNames.add("Lobster");
        mPrices.add("400");

        mImageUrls.add("https://www.dairygoodness.ca/var/ezflow_site/storage/images/dairy-goodness/home/recipes/ginger-shark-steaks/8161624-7-eng-CA/ginger-shark-steaks.jpg");
        mNames.add("Shark");
        mPrices.add("350");

        mImageUrls.add("https://www.thespruceeats.com/thmb/PDEkZZ6o17aru9QLOaFdnU2zwuY=/960x0/filters:no_upscale():max_bytes(150000):strip_icc()/GettyImages-683194578-5aa59577ba6177003761b609.jpg");
        mNames.add("Oreo Shake");
        mPrices.add("30");

        mImageUrls.add("http://www.bakeyourday.net/wp-content/uploads/2014/07/cookies-cream-coffee-milkshakes-71-2-560x890.jpg");
        mNames.add("Coffee Oreo Shake");
        mPrices.add("45");

        mImageUrls.add("https://thepennywisemama.com/wp-content/uploads/2012/10/IMG_31651.png");
        mNames.add("KitKat Shake");
        mPrices.add("30");

        mImageUrls.add("https://cdn-ap-ec.yottaa.net/55b635db0b5344273c002031/d1fd69005c1501336a81123dfe2baf36.yottaa.net/v~4b.480/4163-3-large.jpg?yocs=2u_&yoloc=ap");
        mNames.add("Ice Cream");
        mPrices.add("50");

        mImageUrls.add("https://bakingamoment.com/wp-content/uploads/2013/09/0374square.jpg");
        mNames.add("Brownie");
        mPrices.add("80");



    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ItemAdapter adapter = new ItemAdapter(mNames,mPrices,mImageUrls,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}