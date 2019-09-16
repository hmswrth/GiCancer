package com.example.hems.gicancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4,card5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = (CardView) findViewById(R.id.card_1);
        card2 = (CardView) findViewById(R.id.card_2);
        card3 = (CardView) findViewById(R.id.card_3);
        card4 = (CardView) findViewById(R.id.card_4);
        card5 = (CardView) findViewById(R.id.card_5);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card_1: i = new Intent(this, card1.class);startActivity(i);break;
            case R.id.card_2: i = new Intent(this, card2.class);startActivity(i);break;
            case R.id.card_3: i = new Intent(this, card3.class);startActivity(i);break;
            case R.id.card_4: i = new Intent(this, card4.class);startActivity(i);break;
            case R.id.card_5: i = new Intent(this, card5.class);startActivity(i);break;
            default:break;

        }


    }
}
