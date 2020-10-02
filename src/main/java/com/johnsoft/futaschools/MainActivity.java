package com.johnsoft.futaschools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView futa_logo;
    TextView futa_text, futa_slogan;

    public static final int SPLASH_SCREEN = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        futa_logo = (ImageView) findViewById(R.id.futa_logo);
        futa_text =  (TextView) findViewById(R.id.futa_text);
        futa_slogan  = (TextView) findViewById(R.id.futa_slogan);

        futa_logo.setAnimation(topAnim);
        futa_text.setAnimation(bottomAnim);
        futa_slogan.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SchoolsDashBoardActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}
