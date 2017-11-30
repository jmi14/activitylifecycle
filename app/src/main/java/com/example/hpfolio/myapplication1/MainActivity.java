package com.example.hpfolio.myapplication1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("log", "onCreate() is called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("log","onStart() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("log","onPause is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("log","onResume() is called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("log","onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("log","onDestroy() is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("log","onRestart() is called");
    }
}
