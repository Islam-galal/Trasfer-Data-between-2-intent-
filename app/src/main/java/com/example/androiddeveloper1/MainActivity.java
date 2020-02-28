package com.example.androiddeveloper1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Extra_Massage ="com.example.androiddeveloper1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMassage (View view){

        Intent intent = new Intent(this , DisplayMassageActivity.class);
        EditText editText = findViewById(R.id.enter_massage);
        String massage = editText.getText().toString();
        intent.putExtra(Extra_Massage,massage);
        startActivity(intent);
    }
}
