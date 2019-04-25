package com.example.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button listButton;
    Button objectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objectButton = findViewById(R.id.recebeObjetoButton);
        objectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.recebeObjetoButton:
                        enviarObjeto();
                        break;
                }
            }
        });

        listButton = findViewById(R.id.recebeListaButton);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.recebeListaButton:
                        enviarListaDeDisciplinas();
                        break;
                }
            }
        });

    }

    private void enviarObjeto() {
        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo(100);
        disciplina.setDescricao("Matematica");
        disciplina.setCargaHoraria(3000);
        Intent i = new Intent(this, RecebeObjeto.class);
        i.putExtra("DISCIPLINA", disciplina);
        startActivity(i);
    }

    private void enviarListaDeDisciplinas() {
        ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<Disciplina>();
        Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();

        disciplina1.setCodigo(1);
        disciplina1.setDescricao("Matematica");
        disciplina1.setCargaHoraria(100);

        disciplina2.setCodigo(2);
        disciplina2.setDescricao("Portugues");
        disciplina2.setCargaHoraria(150);

        listaDeDisciplinas.add(disciplina1);
        listaDeDisciplinas.add(disciplina2);

        Intent i = new Intent(this, RecebeLista.class);
        i.putParcelableArrayListExtra("listaDisciplina", listaDeDisciplinas);
        startActivity(i);
    }
}
