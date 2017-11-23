package com.example.hole1.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WalmartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walmart);
        WebView walmartView = (WebView) findViewById(R.id.webViewWalmart);
        walmartView.loadUrl("https://www.walmart.com/ip/Alpine-Original-Spiced" +
                "-Apple-Cider-Instant-Drink-Mix-10-Ct-7-4-Oz/10307486");
    }
}
