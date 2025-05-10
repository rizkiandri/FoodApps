package com.example.foodapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private CheckBox cbSopIga, cbSateKambing, cbDimsumChili, cbEsTeh;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Retrieve intent data (if any)
        Intent intent = getIntent();
        String previousData = intent.getStringExtra("key"); // Use the key that was used to pass the data

        // Initialize CheckBoxes
        cbSopIga = findViewById(R.id.cbSopIga);
        cbSateKambing = findViewById(R.id.cbSateKambing);
        cbDimsumChili = findViewById(R.id.cbDimsumChili);
        cbEsTeh = findViewById(R.id.cbEsTeh);

        // Optional: Display the received data
        if (previousData != null) {
            Toast.makeText(this, "Received: " + previousData, Toast.LENGTH_SHORT).show();
        }
    }

    private void placeOrder() {
        StringBuilder orderSummary = new StringBuilder("You ordered:\n");

        if (cbSopIga.isChecked()) {
            orderSummary.append("Sop Iga\n");
        }
        if (cbSateKambing.isChecked()) {
            orderSummary.append("Sate Kambing\n");
        }
        if (cbDimsumChili.isChecked()) {
            orderSummary.append("Dimsum Chili Oil\n");
        }
        if (cbEsTeh.isChecked()) {
            orderSummary.append("Es Teh\n");
        }

        if (orderSummary.toString().equals("You ordered:\n")) {
            Toast.makeText(this, "No items selected!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, orderSummary.toString(), Toast.LENGTH_LONG).show();


        }
    }
}