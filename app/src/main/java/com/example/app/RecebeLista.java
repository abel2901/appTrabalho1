package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class RecebeLista extends AppCompatActivity {

    private TextView codigo;
    private TextView descricao;
    private TextView cargaHoraria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_objeto);

        codigo = findViewById(R.id.codigoTextView);
        descricao = findViewById(R.id.descricaoTextView);
        cargaHoraria = findViewById(R.id.cargaHorariaTextView);


        ArrayList<Disciplina> listaDeDisciplinas = getIntent().getParcelableArrayListExtra("listaDisciplina");

        if (listaDeDisciplinas != null) {
            codigo.setText(listaDeDisciplinas.get(1).getCodigo().toString());
            descricao.setText(listaDeDisciplinas.get(1).getDescricao());
            cargaHoraria.setText(listaDeDisciplinas.get(1).getCargaHoraria().toString());
        }
    }

}
