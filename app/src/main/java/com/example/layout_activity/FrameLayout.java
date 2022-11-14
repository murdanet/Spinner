package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrameLayout extends AppCompatActivity {

    Button framelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        framelayout=(Button)findViewById(R.id.btn1);
        framelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FrameLayout.this,LinearLayout.class);
                startActivity(i);
            }
        });


    }
}