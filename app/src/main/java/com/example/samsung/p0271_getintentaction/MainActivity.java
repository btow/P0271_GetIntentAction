package com.example.samsung.p0271_getintentaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTime = (Button) findViewById(R.id.btn_time);
        Button btnDate = (Button) findViewById(R.id.btn_date);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {

            case R.id.btn_time :
                intent = new Intent("android.intent.action.time");
                startActivity(intent);
                break;
            case R.id.btn_date :
                intent = new Intent("android.intent.action.date");
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
