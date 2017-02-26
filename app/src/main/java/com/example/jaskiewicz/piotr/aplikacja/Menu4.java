package com.example.jaskiewicz.piotr.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Menu4 extends AppCompatActivity {

    String querry1,querry,qt1,qt2,qt3,qt4,qt5,qt6,qt7,qt8,data,type;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);
       // type="invoice";
        querry = getIntent().getStringExtra("uzer");
        querry1 = getIntent().getStringExtra("shopp");
        qt1 = getIntent().getStringExtra("1");
        qt2 = getIntent().getStringExtra("2");
        qt3 = getIntent().getStringExtra("3");
        qt4 = getIntent().getStringExtra("4");
        qt5 = getIntent().getStringExtra("5");
        qt6 = getIntent().getStringExtra("6");
        qt7 = getIntent().getStringExtra("7");
        qt8 = getIntent().getStringExtra("8");
        data = getIntent().getStringExtra("data");
        txt = (TextView)findViewById(R.id.textView12);
        String temp="DATE:"+" "+data + System.getProperty ("line.separator")+
                "LOGIN: "+" "+querry + System.getProperty ("line.separator")+
                "SHOP:"+" "+querry1 + System.getProperty ("line.separator")+
                "ORDER:" + System.getProperty ("line.separator")+
                " "+qt1+" x "+this.getString(R.string.a)+ System.getProperty ("line.separator")+
                " "+qt2+" x "+this.getString(R.string.b)+ System.getProperty ("line.separator")+
                " "+qt3+" x "+this.getString(R.string.c)+ System.getProperty ("line.separator")+
                " "+qt4+" x "+this.getString(R.string.d)+ System.getProperty ("line.separator")+
                " "+qt5+" x "+this.getString(R.string.e)+ System.getProperty ("line.separator")+
                " "+qt6+" x "+this.getString(R.string.f)+ System.getProperty ("line.separator")+
                " "+qt7+" x "+this.getString(R.string.g)+ System.getProperty ("line.separator")+
                " "+qt8+" x "+this.getString(R.string.h);
        txt.setText(temp);

    }

    public void sendIt(View view){
        String ok = "SUCCESS!";
        type="service";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,querry,qt1,qt2,qt3,qt4,qt5,qt6,qt7,qt8,querry1);
        Intent intent = new Intent(this,Menu1.class).putExtra("uzer",querry).putExtra("jestok",ok);
        startActivity(intent);
    }

    public void finishIt(View view){
        finish();
    }


}
