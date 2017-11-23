package com.example.hole1.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AmazonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
        WebView amazonView = (WebView) findViewById(R.id.WebViewAmazon);
        amazonView.loadUrl("https://www.amazon.com/Alpine-Spiced-Cider-Apple-Flavor/dp/B0016BS29S/");
    }
}
