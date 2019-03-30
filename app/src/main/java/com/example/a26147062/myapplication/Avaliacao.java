package com.example.a26147062.myapplication;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Avaliacao extends AppCompatActivity {

    private TextInputEditText nome;
    private TextInputEditText avaliacao1;
    private TextInputEditText avaliacao2;
    private TextView nomeMediaResultado;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);
        nome = findViewById(R.id.idNome);
        avaliacao1 = findViewById(R.id.idAva1);
        avaliacao2 = findViewById(R.id.idAva2);
        nomeMediaResultado = findViewById(R.id.idTextMedia);
        resultado = findViewById(R.id.idTextResultado);
    }
    public void CalcularMedia (View v){
        String av1 = avaliacao1.getText().toString();
        String av2 = avaliacao2.getText().toString();
        double ava1 = Double.parseDouble(av1);
        double ava2 = Double.parseDouble(av2);
        double media = ((ava1 + ava2)/2);
        nomeMediaResultado.setText("Nome: " + nome);
        nomeMediaResultado.setText("Média = " + media);

        if (ava1 >= 7){
            resultado.setText("Está Aprovado!");
        }else if (ava2 < 4){
            resultado.setText("Está Reprovado");
        }else{
            resultado.setText("Está na prova final");
        }
    }

}
