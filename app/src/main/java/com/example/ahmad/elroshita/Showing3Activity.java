package com.example.ahmad.elroshita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Showing3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing3);


        WebView browser = findViewById(R.id.web_view3_ID);
        ///// 3
        browser.loadUrl("file:///android_asset/37e4628e-9b18-11e8-b59b-0cc47a792c0a_id_37e4628e-9b18-11e8-b59b-0cc47a792c0a.html");

    }

}
