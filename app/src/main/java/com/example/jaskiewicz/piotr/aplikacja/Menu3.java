package com.example.jaskiewicz.piotr.aplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Menu3 extends AppCompatActivity {
    int minteger=0;
    int temp;
    String querry1,querry,qt1,qt2,qt3,qt4,qt5,qt6,qt7,qt8,data;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        querry=getIntent().getStringExtra("uzer");
        querry1=getIntent().getStringExtra("shop");
        data=getIntent().getStringExtra("data");
        t1 = (TextView)findViewById(R.id.text1);
        t2 = (TextView)findViewById(R.id.text2);
        t3 = (TextView)findViewById(R.id.text3);
        t4 = (TextView)findViewById(R.id.text4);
        t5 = (TextView)findViewById(R.id.text5);
        t6 = (TextView)findViewById(R.id.text6);
        t7 = (TextView)findViewById(R.id.text7);
        t8 = (TextView)findViewById(R.id.text8);

    }


    public void save(View view){

       qt1 = t1.getText().toString();
       qt2 = t2.getText().toString();
       qt3 = t3.getText().toString();
       qt4 = t4.getText().toString();
       qt5 = t5.getText().toString();
       qt6 = t6.getText().toString();
       qt7 = t7.getText().toString();
       qt8 = t8.getText().toString();

        Intent intent = new Intent(this,Menu4.class);
        intent.putExtra("uzer",querry);
        intent.putExtra("shopp",querry1);
        intent.putExtra("1",qt1);
        intent.putExtra("2",qt2);
        intent.putExtra("3",qt3);
        intent.putExtra("4",qt4);
        intent.putExtra("5",qt5);
        intent.putExtra("6",qt6);
        intent.putExtra("7",qt7);
        intent.putExtra("8",qt8);
        intent.putExtra("data",data);
        startActivity(intent);



    }

    public void reset(View view){

        String zero="0";
        t1.setText(zero);
        t2.setText(zero);
        t3.setText(zero);
        t4.setText(zero);
        t5.setText(zero);
        t6.setText(zero);
        t7.setText(zero);
        t8.setText(zero);
    }

    public void increaseInteger1(View view) {
        TextView t1 = (TextView)findViewById(R.id.text1);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger1(View view) {

        TextView t1 = (TextView)findViewById(R.id.text1);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger2(View view) {
        TextView t1 = (TextView)findViewById(R.id.text2);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger2(View view) {

        TextView t1 = (TextView)findViewById(R.id.text2);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger3(View view) {
        TextView t1 = (TextView)findViewById(R.id.text3);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger3(View view) {

        TextView t1 = (TextView)findViewById(R.id.text3);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger4(View view) {
        TextView t1 = (TextView)findViewById(R.id.text4);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger4(View view) {

        TextView t1 = (TextView)findViewById(R.id.text4);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger5(View view) {
        TextView t1 = (TextView)findViewById(R.id.text5);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger5(View view) {

        TextView t1 = (TextView)findViewById(R.id.text5);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger6(View view) {
        TextView t1 = (TextView)findViewById(R.id.text6);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger6(View view) {

        TextView t1 = (TextView)findViewById(R.id.text6);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger7(View view) {
        TextView t1 = (TextView)findViewById(R.id.text7);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger7(View view) {

        TextView t1 = (TextView)findViewById(R.id.text7);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }

    public void increaseInteger8(View view) {
        TextView t1 = (TextView)findViewById(R.id.text8);
        int num = Integer.valueOf(t1.getText().toString());
        minteger = num + 1;
        String temp = Integer.toString(minteger);
        t1.setText(temp);

    }public void decreaseInteger8(View view) {

        TextView t1 = (TextView)findViewById(R.id.text8);
        int num = Integer.valueOf(t1.getText().toString());
        if(num==0){
            Toast.makeText(this,"Nie przesadzaj!",Toast.LENGTH_SHORT).show();
        }else {
            minteger = minteger - 1;
            String temp = Integer.toString(minteger);
            t1.setText(temp);
        }
    }



}
