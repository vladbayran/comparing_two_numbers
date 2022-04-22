package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.text_view_result);
        EditText input1 = findViewById(R.id.first_input);
        EditText input2 = findViewById(R.id.second_input);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(view ->
        {
            String val1 = input1.getText().toString();
            String val2 = input2.getText().toString();
            if (val1.equals(val2)) {

                result.setText("Работает");

            } else {
                result.setText("Не работает");

            }
        });


    }
}