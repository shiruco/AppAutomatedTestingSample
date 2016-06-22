package com.example.takatatomoyuki.uiautomatortest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton btn = (AppCompatButton) findViewById(R.id.hogeBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.takatatomoyuki.uiautomatortest", "com.example.takatatomoyuki.uiautomatortest.HogeActivity");
                startActivity(intent);
            }
        });
    }
}
