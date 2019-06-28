package br.com.digitalhouse.alunosrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.com.digitalhouse.alunosrecyclerview.model.Aluno;

public class AlunoDetalhe extends AppCompatActivity {

    private TextView nomeTextView;
    private TextView cursoTextView;
    private TextView dataNascTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno_detalhe);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Aluno aluno = (Aluno) bundle.getSerializable("ALUNO");

        nomeTextView = findViewById(R.id.nome_text_view);
        cursoTextView = findViewById(R.id.curso_text_view);
        dataNascTextView = findViewById(R.id.data_nasc_text_view);

        nomeTextView.setText(aluno.getNome());
        cursoTextView.setText(aluno.getCurso());
        dataNascTextView.setText(aluno.getDataNasc());
    }
}
