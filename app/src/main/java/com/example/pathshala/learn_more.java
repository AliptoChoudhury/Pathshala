package com.example.pathshala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learn_more extends AppCompatActivity {
    Button buttton13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_learn_more);
        buttton13 = findViewById(R.id.button13);
        buttton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learn_more.this,iit_jee.class);
                startActivity(intent);

            }
        });

    }
}