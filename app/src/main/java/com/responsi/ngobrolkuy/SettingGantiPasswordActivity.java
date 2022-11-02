package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingGantiPasswordActivity extends AppCompatActivity {
    private Button ubahpw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_ganti_password);
        ubahpw = findViewById(R.id.btnpwbaru);

        ubahpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H = new Intent(SettingGantiPasswordActivity.this, SettingPwBaru.class);
                startActivity(H);
            }
        });
    }

}