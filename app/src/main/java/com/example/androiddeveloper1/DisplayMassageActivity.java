package com.example.androiddeveloper1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_massage);

        Intent intent = getIntent();
        String massage = intent.getStringExtra(MainActivity.Extra_Massage);
        TextView textView = findViewById(R.id.textView);
        textView.setText(massage);
    }
}
