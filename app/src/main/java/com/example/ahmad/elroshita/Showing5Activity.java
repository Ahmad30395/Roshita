package com.example.ahmad.elroshita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Showing5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing5);

        WebView browser = findViewById(R.id.web_view5_ID);

        ///// 5
        browser.loadUrl("file:///android_asset/549c5ace-9b1a-11e8-b59b-0cc47a792c0a_id_549c5ace-9b1a-11e8-b59b-0cc47a792c0a.html");

    }
}
