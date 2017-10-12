package com.example.ryan.mutlipleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by RYAN on 12/10/2017.
 */

public class GameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
    }

    public void openFriend(View v){
        Intent intent=new Intent(GameActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void openChat(View v){
        Intent intent=new Intent(GameActivity.this,ChatActivity.class);
        startActivity(intent);
    }

    public void openChannel(View v){
        Intent intent = new Intent(GameActivity.this,ChActivity.class);
        startActivity(intent);
    }

    public void openSetting(View v){
        Intent intent=new Intent(GameActivity.this,SettingActivity.class);
        startActivity(intent);
    }
}
