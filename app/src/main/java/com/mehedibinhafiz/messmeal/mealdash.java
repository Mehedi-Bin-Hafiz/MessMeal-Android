package com.mehedibinhafiz.messmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class mealdash extends AppCompatActivity {
    WebView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealdash);
        link=findViewById(R.id.webmeal);
        link.getSettings().setJavaScriptEnabled(true);
        link.loadUrl("http://quiet-wildwood-33076.herokuapp.com/dashboard/");

    }
}
