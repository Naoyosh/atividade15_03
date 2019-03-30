package com.example.a26147062.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Operadora extends AppCompatActivity {

    private RadioGroup rg;
    private TextInputEditText minutosChamada;
    private Button botao;
    private TextView txtResultado;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadora);
        rg = findViewById(R.id.opGrupo);
        minutosChamada = findViewById(R.id.minutos);
        botao = findViewById(R.id.calcularY);
        txtResultado = findViewById(R.id.resul);
    }

    public void calcularValor (View v){
        String minutos = minutosChamada.getText().toString();
        double min = Double.parseDouble(minutos);
        if (rg.getCheckedRadioButtonId() == R.id.Op1){
            resultado = ((min * 60) * 0.020 - 0.1);
        }else if (rg.getCheckedRadioButtonId() == R.id.Op2){
            resultado = ((min * 60) * 0.025 - 0.125);
        }else{
            resultado = ((min * 60) * 0.019 - 0.095);
        }
        txtResultado.setText("Total da ligação " + resultado + " reais");
    }

}
