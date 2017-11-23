package com.example.hole1.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UCSDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsd);
        WebView ucsdView = (WebView) findViewById(R.id.WebViewUCSD);
        ucsdView.loadUrl("https://ucsd.edu/");
    }
}
