package com.sigmotoa.navalg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnR0C0 = findViewById(R.id.btn_1);
        Button btnR0C1 = findViewById(R.id.btn_2);

        btnR0C0.setOnClickListener(v -> {
                btnR0C0.setBackgroundColor(getColor(R.color.rojo));
                btnR0C0.setImageDrawable(getDrawable(R.drawable.baseline_tag_faces_24));
        });

        btnR0C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnR0C1.setBackgroundColor(getColor(R.color.verde));
            }
        });

    }
}