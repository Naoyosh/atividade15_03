package com.example.a26147062.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Valor_de_Y extends AppCompatActivity {

    private TextInputEditText valorX;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_de__y);
        valorX = findViewById(R.id.valuex);
        resultado = findViewById(R.id.resultadoY);
    }

    public void calcularValorY (View v){
        String vx = valorX.getText().toString();
        double y = Double.parseDouble(vx);
        resultado.setText("Valor de Y é: " + 8/(2-y));

    }

}
