package com.example.estacio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editGasolina;
    EditText editAlcool;

    TextView resultview;
Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editGasolina = findViewById(R.id.editGasolina);
        editAlcool = findViewById(R.id.editAlcool);
            resultview = findViewById(R.id.textViewMainTitle);
        botao = findViewById(R.id.btnCalc);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Double result = Double.valueOf(editGasolina.getText().toString());
                    resultview.setText(String.valueOf(result+1));

                } catch (NumberFormatException e ){

                    Toast.makeText(getApplicationContext(), "Zica", Toast.LENGTH_LONG).show();


                }



            }
        });





    }
}


