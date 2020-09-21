package com.example.alertdialog13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Order order =
                new FastFoodOrderBuilder()
                        .orderType(OrderType.ON_SITE)
                .breadType(BreadType.BEEF)
                .build();
        Log.d("BBB",order.toString());
    }
}