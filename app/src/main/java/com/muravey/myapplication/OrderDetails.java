package com.muravey.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {

    TextView listView,priceView;
    String list_choice;
    Double price_kg,price_usd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        listView = findViewById(R.id.listView);
        priceView = findViewById(R.id.priceView);


        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_kg = bundle.getDouble("price");

        price_usd = price_kg * 79.0;


        listView.setText(list_choice);
        priceView.setText(price_kg.toString());

    }
}
