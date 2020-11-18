package com.example.loginovka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private ImageView Home;
    private ImageView Camera;
    private ImageView Gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Home = (ImageView) findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
        Camera = (ImageView) findViewById(R.id.Camera);
        Camera.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
        Gallery = (ImageView) findViewById(R.id.ImageView39);
        Gallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openActivity4();
            }
        });
    }
    public void openActivity2() {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent= new Intent(this, main3.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent= new Intent(this, Main4.class);
        startActivity(intent);
    }
}