package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView rezultat;
    EditText a;
    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a= (EditText) findViewById(R.id.idBr1);
        b= (EditText) findViewById(R.id.idBr2);
        rezultat = (TextView) findViewById(R.id.idRezultat);

    }

    public void onClickSaberi(View view){
        int a1 = Integer.parseInt(String.valueOf(a.getText()));
        int b1 = Integer.parseInt(String.valueOf(b.getText()));
        rezultat.setText(String.valueOf(a1+b1));
    }
}