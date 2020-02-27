package com.mehedibinhafiz.messmeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mealdash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mealdash=findViewById(R.id.mealdash);
    }

    public void mealdash(View view){
        Intent meal = new Intent(MainActivity.this,mealdash.class);
        startActivity(meal);
    }
    public void deposit(View view){
        Intent meal = new Intent(MainActivity.this,deposite.class);
        startActivity(meal);
    }
    public void Expense(View view){
        Intent meal = new Intent(MainActivity.this,Expense.class);
        startActivity(meal);
    }
}
