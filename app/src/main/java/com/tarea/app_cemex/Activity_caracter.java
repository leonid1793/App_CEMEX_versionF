package com.tarea.app_cemex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_caracter extends AppCompatActivity {

    private Button _decrease;
    private Button _increase;
    private TextView _value;
    private static int _counter = 45;
    private String _stringVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracter);

        _decrease = (Button) findViewById(R.id.button1);
        _increase = (Button) findViewById(R.id.button2);
        _value = (TextView) findViewById(R.id.textView1);

        _decrease.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Decreasing value...");
                _counter--;
                _stringVal = Integer.toString(_counter);
                _value.setText(_stringVal);
            }
        });

        _increase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Increasing value...");
                _counter++;
                _stringVal = Integer.toString(_counter);
                _value.setText(_stringVal);
            }
        });

    }
}
