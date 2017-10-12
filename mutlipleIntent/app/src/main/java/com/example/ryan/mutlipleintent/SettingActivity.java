package com.example.ryan.mutlipleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by RYAN on 12/10/2017.
 */

public class SettingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);
    }

    public void openFriend(View v){
        Intent intent=new Intent(SettingActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void openChat(View v){
        Intent intent=new Intent(SettingActivity.this,ChatActivity.class);
        startActivity(intent);
    }

    public void openChannel(View v){
        Intent intent = new Intent(SettingActivity.this,ChActivity.class);
        startActivity(intent);
    }

    public void openGame(View v){
        Intent intent=new Intent(SettingActivity.this,GameActivity.class);
        startActivity(intent);
    }


}
