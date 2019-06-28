package br.com.digitalhouse.alunosrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.alunosrecyclerview.R;
import br.com.digitalhouse.alunosrecyclerview.interfaces.AlunosListener;
import br.com.digitalhouse.alunosrecyclerview.model.Aluno;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {

    private List<Aluno> listaAlunos;
    private AlunosListener alunosListener;

    public AlunoAdapter(List<Aluno> listaAlunos, AlunosListener alunosListener) {
        this.listaAlunos = listaAlunos;
        this.alunosListener = alunosListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aluno_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Aluno aluno = listaAlunos.get(i);
        viewHolder.setupALuno(aluno);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alunosListener.onAlunoClicado(aluno);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView alunoImageView;
        private TextView nomeTextView;
        private TextView cursoTexView;
        private TextView dataNascTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            alunoImageView = itemView.findViewById(R.id.aluno_image_view);
            nomeTextView = itemView.findViewById(R.id.nome_aluno_text_view);
            cursoTexView = itemView.findViewById(R.id.curso_text_view);
            dataNascTextView = itemView.findViewById(R.id.data_nasc_text_view);

        }

        public void setupALuno(Aluno aluno){

            nomeTextView.setText("Nome: " +aluno.getNome());
            cursoTexView.setText("Curso: "+aluno.getCurso());
            dataNascTextView.setText("Data de nascimento:"+aluno.getDataNasc());
        }
    }
}
