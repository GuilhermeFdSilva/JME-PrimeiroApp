package com.guilherme.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero (View view) {
        TextView texto = findViewById(R.id.numSort);
        int numero = new Random().nextInt(11);
        texto.setText(String.format("Número: %d", numero));
    }
}