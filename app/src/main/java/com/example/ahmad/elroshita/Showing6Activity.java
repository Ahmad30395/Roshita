package com.example.ahmad.elroshita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Showing6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing6);

        WebView browser = (WebView) findViewById(R.id.web_view6_ID);


        ///// 6
        browser.loadUrl("file:///android_asset/a967a0a4-9b1a-11e8-b59b-0cc47a792c0a_id_a967a0a4-9b1a-11e8-b59b-0cc47a792c0a.html");

    }
}
