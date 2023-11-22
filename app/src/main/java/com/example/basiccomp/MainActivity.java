package com.example.basiccomp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button changeColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textView = findViewById(R.id.textView);
        changeColorButton = findViewById(R.id.changeColorButton);

        // Set onClickListener for the button
        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTextColor();
            }
        });
    }

    private void changeTextColor() {
        // Change text color to a random color
        int newColor = getRandomColor();
        textView.setTextColor(newColor);
    }

    private int getRandomColor() {
        // Generate a random color
        return Color.rgb(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
    }
}
