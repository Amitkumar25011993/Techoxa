package com.example.amit.techoxa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 1500;
    TextView tvLogoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeatureFullScreen();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

    void initView(){
        tvLogoText = (TextView) findViewById(R.id.tv_logo_text);
    }

    private void requestWindowFeatureFullScreen(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
