package com.example.myapplicationpertemuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aplikasi Proyek2-JMP_A");

        TextInputLayout etUsername = findViewById(R.id.et_username);
        TextInputLayout etPassword = findViewById(R.id.et_password);
        Button bLogin = findViewById(R.id.b_login);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getEditText().getText().toString();
                String password = etPassword.getEditText().getText().toString();

                if(username.equals("Hilmi") && password.equals("123456")){
                    finish();
                    Intent intent = new Intent(MainActivity.this, DaftarNegaraActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}