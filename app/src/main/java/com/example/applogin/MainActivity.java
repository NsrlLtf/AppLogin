package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputUsername = (EditText) findViewById(R.id.inputUsername);
        EditText inputPassword = (EditText) findViewById(R.id.inputPassword);

        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        String username_valid = "usm";
        String password_valid = "jaya";

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsernameString = inputUsername.getText().toString();
                String inputPasswordString = inputPassword.getText().toString();

                if( (inputUsername.getText().toString().trim().isEmpty()) || (inputPassword.getText().toString().trim().isEmpty()) ){
                    Toast.makeText(getApplicationContext(), "Isian tidak valid", Toast.LENGTH_SHORT).show();
                }else{
                    if ((inputUsername.getText().toString().trim().equals(username_valid)) && (inputPassword.getText().toString().trim().equals(password_valid)) ){
                        Toast.makeText(getApplicationContext(), "Login berhasil", Toast.LENGTH_SHORT).show();

                        Intent intent_dashboard = new Intent(MainActivity.this, DashboardActivity.class);
                        intent_dashboard.putExtra("username", username_valid);
                        startActivity(intent_dashboard);

                    }else{
                        Toast.makeText(getApplicationContext(), "Login gagal", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });

    }
}