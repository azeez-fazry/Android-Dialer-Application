package com.example.azeezfazryphoneapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvDial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDial = findViewById(R.id.tvPhoneNumber);
    }

    public void buDialAction(View view) {
        Button button = (Button)view;
        String digit = button.getText().toString();
        String phoneNumber = tvDial.getText().toString();
        tvDial.setText(phoneNumber + digit);
    }


    public void buDeleteAction(View view) {
        try {
            String phoneNumber = tvDial.getText().toString();
            StringBuffer stringBuffer = new StringBuffer(phoneNumber);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            tvDial.setText(stringBuffer.toString());
        } catch (Exception e) {
            Toast.makeText(this,"Phone number is empty", Toast.LENGTH_SHORT).show();
        }
    }
}