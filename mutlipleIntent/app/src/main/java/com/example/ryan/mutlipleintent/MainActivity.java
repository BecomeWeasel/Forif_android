package com.example.ryan.mutlipleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openChat(View v){
        Intent intent=new Intent(MainActivity.this,ChatActivity.class);
        startActivity(intent);
    }

    public void openChannel(View v){
        Intent intent = new Intent(MainActivity.this,ChActivity.class);
        startActivity(intent);
    }

    public void openGame(View v){
        Intent intent=new Intent(MainActivity.this,GameActivity.class);
        startActivity(intent);
    }

    public void openSetting(View v){
        Intent intent=new Intent(MainActivity.this,SettingActivity.class);
        startActivity(intent);
    }
}
