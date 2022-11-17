package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TableLayout extends AppCompatActivity {
ImageButton flecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        flecha=(ImageButton)findViewById(R.id.imageButton2);
        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(TableLayout.this,LinearLayout.class);
              startActivity(intent);
            }
        });
    }
}