package com.example.foodapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private EditText editNIM, editNIM2, editNIM3;
    private Button btnRegister, btnLogin; // Tambahkan btnLogin jika Anda ingin menambahkannya

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi EditText dan Button setelah setContentView
        editNIM = findViewById(R.id.editNIM);
        editNIM2 = findViewById(R.id.editNIM2);
        editNIM3 = findViewById(R.id.editNIM3);
        btnRegister = findViewById(R.id.btnlogin); // Pastikan ID ini sesuai dengan layout Anda
        btnLogin = findViewById(R.id.btnlogin); // Tambahkan ID untuk tombol login jika ada

        // Set listener untuk tombol register
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser ();
            }
        });

        // Set listener untuk tombol login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToLogin();
            }
        });
    }

    private void registerUser () {
        String username = editNIM2.getText().toString().trim();
        String email = editNIM.getText().toString().trim();
        String password = editNIM3.getText().toString().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(Register.this, Regist_Login.class);
        startActivity(intent);
    }
}