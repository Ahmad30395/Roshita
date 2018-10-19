package com.example.ahmad.elroshita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1_ID);
        btn2 = findViewById(R.id.btn2_ID);
        btn3 = findViewById(R.id.btn3_ID);
        btn4 = findViewById(R.id.btn4_ID);
        btn5 = findViewById(R.id.btn5_ID);
        btn6 = findViewById(R.id.btn6_ID);



        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1_ID :

                Intent intent1 = new Intent(this , ShowingActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn2_ID :

                Intent intent2 = new Intent(this , Showing2Activity.class);
                startActivity(intent2);
                break;
            case R.id.btn3_ID :

                Intent intent3 = new Intent(this , Showing3Activity.class);
                startActivity(intent3);
                break;
            case R.id.btn4_ID :

                Intent intent4 = new Intent(this , Showing4Activity.class);
                startActivity(intent4);
                break;
            case R.id.btn5_ID :

                Intent intent5 = new Intent(this , Showing5Activity.class);
                startActivity(intent5);
                break;
            case R.id.btn6_ID :

                Intent intent6 = new Intent(this , Showing6Activity.class);
                startActivity(intent6);
                break;
        }
    }
}
