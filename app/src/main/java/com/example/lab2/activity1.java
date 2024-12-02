package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn1(View view) {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }

    public void onClickBtn2(View view) {
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }

    public void onClickBtn3(View view) {
        Intent intent = new Intent(this, activity4.class);
        startActivity(intent);
    }

    public void OnClickBtn4(View view) {
        finishAffinity();
    }

}