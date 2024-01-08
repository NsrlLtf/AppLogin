package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Bundle bundle_extra = getIntent().getExtras();
        String username_kiriman = bundle_extra.getString("username");

        TextView tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvUsername.setText(username_kiriman);

        Button btnKembali = (Button) findViewById(R.id.btnKembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_main = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent_main);
            }
        });
    }
}