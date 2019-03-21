package com.example.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        /**Pega a intent que iniciou esta activity e extrai a string*/
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        /**Captura o TextView do Layout e coloca na string como texto*/
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }
}
