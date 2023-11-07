package com.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainToast extends AppCompatActivity {
    private int hitung = 0;
    private TextView showHitung;
    private int fib1 = 1; // Nilai pertama dalam deret Fibonacci
    private int fib2 = 1; // Nilai keduadalam deret Fibonacci

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        showHitung = (TextView)findViewById(R.id.show_count);
    }

    public void showtoast(View view) {
        Toast toast= Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        int nextFib = fib1 + fib2;
        showHitung.setText(Integer.toString(fib1));

        // Geser nilai dalam deret Fibonacci
        fib1 = fib2;
        fib2 = nextFib;
    }
}