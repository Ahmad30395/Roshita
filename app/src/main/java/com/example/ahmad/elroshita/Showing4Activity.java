package com.example.ahmad.elroshita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Showing4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing4);


        WebView browser = (WebView) findViewById(R.id.web_view4_ID);

        ///// 4
        browser.loadUrl("file:///android_asset/19b77f9c-9b1a-11e8-b59b-0cc47a792c0a_id_19b77f9c-9b1a-11e8-b59b-0cc47a792c0a.html");

    }
}
