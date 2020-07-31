package com.example.groupproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_manu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.manuAbout:
                Intent intentAbout = new Intent(LoginActivity.this,AboutActivity.class);
                startActivity(intentAbout);

                Toast.makeText(this, "About Screen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manuContact:
                Intent intentContact = new Intent(LoginActivity.this,ContactActivity.class);
                startActivity(intentContact);

                Toast.makeText(this, "Contact Screen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manuLogin:

                Toast.makeText(this, "Login Screen", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}