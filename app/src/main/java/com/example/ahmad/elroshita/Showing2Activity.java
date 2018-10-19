package com.example.ahmad.elroshita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Showing2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing2);

        WebView browser = (WebView) findViewById(R.id.web_view2_ID);

        ///// 2
        browser.loadUrl("file:///android_asset/1ebb6e0c-9b17-11e8-b59b-0cc47a792c0a_id_1ebb6e0c-9b17-11e8-b59b-0cc47a792c0a.html");

    }
}
