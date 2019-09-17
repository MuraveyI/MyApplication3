package com.muravey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button latteebtn,cappucinobtn,americanobtn;

    String choices;
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latteebtn = findViewById(R.id.lattebtn);
        cappucinobtn = findViewById(R.id.cappucinobtn);
        americanobtn = findViewById(R.id.americanobtn);

    }

    public void addList(View view){
        if(view == findViewById(R.id.lattebtn)){

            choices = choices+"Lattee"+"\n";
            price = price+170;

        }

       else if(view == findViewById(R.id.cappucinobtn)){

            choices = choices+"Cappucino"+"\n";
            price = price+150;

        }
        else if(view == findViewById(R.id.americanobtn)){

            choices = choices+"Americano"+"\n";
            price = price+90;

        }
    }

    public void order(View view){

        Intent i = new Intent(MainActivity.this, OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices", choices );
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i );

    }
}
