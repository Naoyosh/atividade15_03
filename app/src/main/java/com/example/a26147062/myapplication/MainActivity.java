package com.example.a26147062.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.textservice.TextInfo;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText valor;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor = findViewById(R.id.inValorC);
        Resultado = findViewById(R.id.Resulatdo);
    }

    public void calcularValor(View v){
        double valorConta = Double.parseDouble(valor.getText().toString());
        double res = valorConta * 1.1;
        String texto = "0 valor da conta é " + res;
        Resultado.setText(texto);
    }
}