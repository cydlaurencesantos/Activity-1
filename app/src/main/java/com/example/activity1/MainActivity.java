package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_red,button_blue,button_green,button_reset;

    View backgroundView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundView = this.getWindow().getDecorView();
        button_red = (Button)findViewById(R.id.btn_red);
        button_blue = (Button)findViewById(R.id.btn_blue);
        button_green = (Button)findViewById(R.id.btn_green);
        button_reset = (Button)findViewById(R.id.btn_reset);

        button_red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (button_red.getText().equals("Red"))
                {
                    backgroundView.setBackgroundResource(R.color.redColor);
                    Toast.makeText(MainActivity.this,"You changed the background color to red",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button_green.getText().equals("Green"))
                {
                    backgroundView.setBackgroundResource(R.color.greenColor);
                    Toast.makeText(MainActivity.this,"You changed the background color to green",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_blue.getText().equals("Blue"))
                {
                    backgroundView.setBackgroundResource(R.color.blueColor);
                    Toast.makeText(MainActivity.this,"You changed the background color to blue",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_reset.getText().equals("Reset"))
                {
                    backgroundView.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this,"The background color has been reset",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}