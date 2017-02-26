package com.example.jaskiewicz.piotr.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu2 extends AppCompatActivity {
    Button tesco, lidl, biedronka;
    String querry,querry1,data;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        tesco = (Button)findViewById(R.id.button4);
        lidl = (Button)findViewById(R.id.button5);
        biedronka = (Button)findViewById(R.id.button6);
        textView = (TextView)findViewById(R.id.text_top);
        querry=getIntent().getStringExtra("uzer");
        data=getIntent().getStringExtra("data");
    }

    public void OnClickMenu(View view){
       querry1=((Button) view).getText().toString();
        Intent intent = new Intent(this,Menu3.class);
        intent.putExtra("uzer",querry);
        intent.putExtra("shop",querry1);
        intent.putExtra("data",data);
        startActivity(intent);
    }
}
