package com.example.jaskiewicz.piotr.aplikacja;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Piotrek on 2016-12-26.
 */
class BackgroundWorker extends AsyncTask<String,Void,String> {
    String usr_name,type;
    boolean digitsOnly;
    boolean logged;
    Context context;
  //  TextView Text_top;
    AlertDialog alertDialog;
  public String result="";
 // Activity activity;

    BackgroundWorker(Context ctx){
        context = ctx;
        logged=false;
        digitsOnly=false;

    }

    @Override
    protected String doInBackground(String... params) {
        digitsOnly= TextUtils.isDigitsOnly(result);
        String type = params[0];
        String login_url = "http://fuhjagoda.esy.es/login.php";
        String serv_url = "http://fuhjagoda.esy.es/add_service.php";
      //  String log_url = "http://fuhjagoda.esy.es/log_in.php";
        String logout_url = "http://fuhjagoda.esy.es/log_out.php";
        if (type.equals("login")) {
            try {
                String user_name = params[1];
                usr_name = params[1];
                String password = params[2];
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name", "UTF-8") + "=" + URLEncoder.encode(user_name, "UTF-8") + "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                // String result="";
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (type.equals("service")) {
            try {

                String user = params[1];
                String qt1 = params[2];
                String qt2 = params[3];
                String qt3 = params[4];
                String qt4 = params[5];
                String qt5 = params[6];
                String qt6 = params[7];
                String qt7 = params[8];
                String qt8 = params[9];
                String querry1 = params[10];

                URL url = new URL(serv_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(user, "UTF-8")
                        + "&" + URLEncoder.encode("qt1", "UTF-8") + "=" + URLEncoder.encode(qt1, "UTF-8")
                        + "&" + URLEncoder.encode("qt2", "UTF-8") + "=" + URLEncoder.encode(qt2, "UTF-8")
                        + "&" + URLEncoder.encode("qt3", "UTF-8") + "=" + URLEncoder.encode(qt3, "UTF-8")
                        + "&" + URLEncoder.encode("qt4", "UTF-8") + "=" + URLEncoder.encode(qt4, "UTF-8")
                        + "&" + URLEncoder.encode("qt5", "UTF-8") + "=" + URLEncoder.encode(qt5, "UTF-8")
                        + "&" + URLEncoder.encode("qt6", "UTF-8") + "=" + URLEncoder.encode(qt6, "UTF-8")
                        + "&" + URLEncoder.encode("qt7", "UTF-8") + "=" + URLEncoder.encode(qt7, "UTF-8")
                        + "&" + URLEncoder.encode("qt8", "UTF-8") + "=" + URLEncoder.encode(qt8, "UTF-8")
                        + "&" + URLEncoder.encode("shopp", "UTF-8") + "=" + URLEncoder.encode(querry1, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                // String result="";
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                digitsOnly= TextUtils.isDigitsOnly(result);
                return result;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if (type.equals("logout")) {
            try {
                String user_name = params[1];
                URL url = new URL(logout_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name", "UTF-8") + "=" + URLEncoder.encode(user_name, "UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                // String result="";
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    @Override
    protected void onPreExecute() {
       alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login status");

    }

    @Override
    protected void onPostExecute(String result) {

       alertDialog.setMessage(result);
        alertDialog.show();
        Log.d("x", "masz1" + result);
        //logowanie
        if(result.equals("OK")) {
            Log.d("x", "masz2" + result.toString());
            Intent intent_log = new Intent(context,Menu1.class);
            intent_log.putExtra("uzer",usr_name);
            context.startActivity(intent_log);
        }else if(result.equals("GIT")) {
            Toast.makeText(context, "ADDED" + result.toString(), Toast.LENGTH_SHORT).show();
            Log.d("x", "masz3" + result.toString());
          //  Intent intent_log = new Intent(context, Menu1.class);
           // context.startActivity(intent_log);

        }



    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

}
