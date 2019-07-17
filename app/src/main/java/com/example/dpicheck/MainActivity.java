package com.example.dpicheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        TextView textView = findViewById(R.id.tv_text);
        int dpi = (int)(metrics.density * 160f);
        textView.setText("DPI Value : "+dpi);
    }
}
