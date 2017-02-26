package com.example.jaskiewicz.piotr.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Date;

public class Menu1 extends AppCompatActivity {

TextView textView,textView3;
String temp,data,tempor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);
        textView = (TextView)findViewById(R.id.text_top);
        textView3 = (TextView)findViewById(R.id.textView3);
        tempor = getIntent().getStringExtra("jestok");
        textView3.setText(tempor);
        temp = getIntent().getStringExtra("uzer");
        textView.setText("Witaj " + temp + " !");
        Date date = new Date();
        data=date.toString();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        logOut();
    }

    public void startWork(View view){
        startActivity(new Intent(this, Menu2.class).putExtra("uzer", temp).putExtra("data", data));
    }

    public void logOut(View view){
        String type = "logout";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, temp);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void logOut(){
        String type = "logout";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, temp);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
