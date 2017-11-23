package com.example.hole1.myplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonAmazon, buttonWalmart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        buttonAmazon = (Button) findViewById(R.id.buttonAmazon);
        buttonAmazon.setOnClickListener(this);
        buttonWalmart = (Button) findViewById(R.id.buttonWalmart);
        buttonWalmart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.buttonAmazon:
                Intent a;
                a = new Intent(this, AmazonActivity.class);
                startActivity(a);
                break;
            case R.id.buttonWalmart:
                Intent w;
                w = new Intent(this,WalmartActivity.class);
                startActivity(w);
                break;
        }
    }
}
