package com.example.ahmad.elroshita;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ShowingActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showing);

        WebView browser = (WebView) findViewById(R.id.web_view_ID);

        // Simplest usage: note that an exception will NOT be thrown
        // if there is an error loading this page (see below).


        ///// 1
        browser.loadUrl("file:///android_asset/215cf388-9af9-11e8-b59b-0cc47a792c0a_id_215cf388-9af9-11e8-b59b-0cc47a792c0a.html");


    }
}
