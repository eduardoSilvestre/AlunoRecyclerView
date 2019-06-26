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
import br.com.digitalhouse.alunosrecyclerview.model.Aluno;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {

    private List<Aluno> listaAlunos;

    public AlunoAdapter(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aluno_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Aluno aluno = listaAlunos.get(i);
        viewHolder.setupALuno(aluno);

    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView alunoImageView;
        private TextView nomeTextView;
        private TextView cursoTexView;
        private TextView dataNasc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            alunoImageView = itemView.findViewById(R.id.aluno_image_view);
            nomeTextView = itemView.findViewById(R.id.nome_aluno_text_view);
            cursoTexView = itemView.findViewById(R.id.curso_text_view);
            dataNasc = itemView.findViewById(R.id.data_nasc_text_view);

        }

        public void setupALuno(Aluno aluno){

            nomeTextView.setText(aluno.getNome());
            cursoTexView.setText(aluno.getCurso());
            dataNasc.setText(aluno.getDataNasc());
        }
    }
}
