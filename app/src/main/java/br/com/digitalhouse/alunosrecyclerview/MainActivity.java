package br.com.digitalhouse.alunosrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.alunosrecyclerview.adapter.AlunoAdapter;
import br.com.digitalhouse.alunosrecyclerview.interfaces.AlunosDetalhes;
import br.com.digitalhouse.alunosrecyclerview.model.Aluno;

public class MainActivity extends AppCompatActivity implements AlunosDetalhes {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Aluno> listaAlunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Eduardo", "Mobile Android", "23/10/1999");
        listaAlunos.add(aluno1);

        Aluno aluno2 = new Aluno("José", "Mobile IOS", "24/04/1999");
        listaAlunos.add(aluno2);

        Aluno aluno3 = new Aluno("Vinicius", "Full Stack", "11/11/1993");
        listaAlunos.add(aluno3);

        AlunoAdapter alunoAdapter = new AlunoAdapter(listaAlunos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.aluno_recycler_view);
            recyclerView.setAdapter(alunoAdapter);
            recyclerView.setLayoutManager(layoutManager);
    }


    @Override
    public void onAlunoClicado(Aluno aluno) {

        Intent intent = new Intent(this, AlunoDetalhe.class);
    }
}
