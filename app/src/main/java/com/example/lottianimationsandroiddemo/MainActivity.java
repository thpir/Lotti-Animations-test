package com.example.lottianimationsandroiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.StartAnimation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LottieAnimationView animationView = findViewById(R.id.animationView);
                animationView.playAnimation();
            }
        });

        button = findViewById(R.id.StopAnimation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LottieAnimationView animationView = findViewById(R.id.animationView);
                animationView.pauseAnimation();
            }
        });
    }
}