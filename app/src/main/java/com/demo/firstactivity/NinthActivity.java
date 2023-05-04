package com.demo.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NinthActivity extends AppCompatActivity {

    CardView cardFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        initview();
    }

    private void initview() {

        cardFinish= findViewById(R.id.cardFinish);

        cardFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NinthActivity.this,TenActivity.class);
                startActivity(i);
            }
        });
    }
}