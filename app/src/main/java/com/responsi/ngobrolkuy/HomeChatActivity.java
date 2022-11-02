package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeChatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);

        for (int i = 1; i <= 6; i++) {
            int id = getResources().getIdentifier("ct" + Integer.toString(i), "id", "com.responsi.ngobrolkuy");
            View view = findViewById(id);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(HomeChatActivity.this, RoomChatActivity.class);
                    startActivity(i);
                }
            });
        }
    }
}