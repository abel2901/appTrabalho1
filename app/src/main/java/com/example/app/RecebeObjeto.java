package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeObjeto extends AppCompatActivity {
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

        Bundle b = getIntent().getExtras();
        Disciplina disciplina = (Disciplina) b.get("DISCIPLINA");
        codigo.setText(disciplina.getCodigo().toString());
        descricao.setText(disciplina.getDescricao());
        cargaHoraria.setText(disciplina.getCargaHoraria().toString());

    }
}
