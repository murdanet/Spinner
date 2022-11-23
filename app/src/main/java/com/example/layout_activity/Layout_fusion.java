package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Layout_fusion extends AppCompatActivity {
 ImageButton messi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_fusion);

        messi=(ImageButton) findViewById(R.id.messi);
        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Layout_fusion.this, ButtonsActivity.class);
                startActivity(i);
            }
        });
    }
}