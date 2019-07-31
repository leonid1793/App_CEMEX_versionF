package com.tarea.app_cemex;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainRegistroActivity extends AppCompatActivity {
    Button inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);

        inicio = (Button) findViewById(R.id.button_crear);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainRegistroActivity.this, MainActivity.class));
            }
        });

    }
}
