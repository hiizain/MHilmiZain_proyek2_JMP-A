package com.example.myapplicationpertemuan7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DaftarNegaraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_negara);

        getSupportActionBar().setTitle("Input Negara");

        ArrayList<String> alNegara = new ArrayList<>();
        alNegara.add("Indonesia");
        alNegara.add("Malaysia");
        alNegara.add("Thailand");
        alNegara.add("Singapura");

        EditText etNegara = findViewById(R.id.et_negara);
        Button button = findViewById(R.id.button);
        ListView lvNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alNegara);
        lvNegara.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaNegara = etNegara.getText().toString();
                if (!namaNegara.equals("")){
//                    adapter.add(namaNegara);
                    alNegara.add(namaNegara);
                    adapter.notifyDataSetChanged();
                    etNegara.setText("");
                } else {
                    Toast.makeText(DaftarNegaraActivity.this, "Masukkan Nama Negara", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = null;
        if (item.getItemId() == R.id.m_logout){
            intent = new Intent(this, MainActivity.class);
        }
        startActivity(intent);
        return true;
    }
}