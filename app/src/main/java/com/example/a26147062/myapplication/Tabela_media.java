package com.example.a26147062.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tabela_media extends AppCompatActivity {

    private TextInputEditText inputAltura;
    private RadioGroup rdGroup;
    private TextView txtResultado;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela_media);
        inputAltura = findViewById(R.id.alt);
        rdGroup = findViewById(R.id.rg);
        txtResultado= findViewById(R.id.resul);
    }

    public void calcularPesoIdeal(View v ){
        String altura = inputAltura.getText().toString();
        if (rdGroup.getCheckedRadioButtonId() == R.id.masc){
            resultado = (72.7 * Double.parseDouble(altura)) - 58;
        }else{
            resultado = (62.1 * Double.parseDouble(altura)) - 44.7;
        }
    }

}

