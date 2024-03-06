package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonADD, buttonSUB, buttonDIV, buttonMUL;
    EditText editText1, editText2;
    TextView textView;
    int nr1, nr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonADD = findViewById(R.id.buttonADD);
        buttonDIV = findViewById(R.id.buttonDIV);
        buttonSUB = findViewById(R.id.buttonSUB);
        buttonMUL = findViewById(R.id.buttonMUL);
        editText1 = findViewById(R.id.editTextText1);
        editText2 = findViewById(R.id.editTextText2);
        textView = findViewById(R.id.textView);

        buttonADD.setOnClickListener(this);
        buttonSUB.setOnClickListener(this);
        buttonDIV.setOnClickListener(this);
        buttonMUL.setOnClickListener(this);
    }
    public int getNumberFromText(EditText editText1){
        if(editText1.getText().toString().equals("")){
            Toast.makeText(this, "Campul este gol. Introduceti un numar", Toast.LENGTH_SHORT).show();
            return 0;
        }
        else
            return Integer.parseInt(editText1.getText().toString());
    }

    @Override
    public void onClick(View view){
        nr1 = getNumberFromText(editText1);
        nr2 = getNumberFromText(editText2);

        if (view.getId() == R.id.buttonADD) {
            textView.setText(String.valueOf(nr1 + nr2));
        }
        else
            if (view.getId() == R.id.buttonSUB) {
            textView.setText(String.valueOf(nr1 - nr2));
            }
             else
                if (view.getId() == R.id.buttonDIV) {
                    textView.setText(String.valueOf(nr1 / nr2));
                }
                 else
                     if (view.getId() == R.id.buttonMUL) {
                        textView.setText(String.valueOf(nr1 * nr2));
                     }
    }

}