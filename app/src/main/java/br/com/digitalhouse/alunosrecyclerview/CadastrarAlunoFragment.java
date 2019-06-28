package br.com.digitalhouse.alunosrecyclerview;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.com.digitalhouse.alunosrecyclerview.interfaces.AlunosListener;
import br.com.digitalhouse.alunosrecyclerview.model.Aluno;

public class CadastrarAlunoFragment extends Fragment {

        CadastrarAlunoAction alunosListener;


    public CadastrarAlunoFragment() {
        // Required empty public constructor
    }

    public interface CadastrarAlunoAction{
        void cadastrarAluno(Aluno aluno);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_cadastrar_aluno, container, false);



        Button buttonCriar = view.findViewById(R.id.button_criar_id);

        final TextInputEditText textInputNome = view.findViewById(R.id.cadastro_nome_edit_text);
        final TextInputEditText textInputCurso = view.findViewById(R.id.cadstro_curso_edit_text);
        final TextInputEditText textInputDataNasc = view.findViewById(R.id.cadastro_data_edit_text);

        buttonCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criar(textInputNome,textInputCurso,textInputDataNasc);
            }
        });




     return view;
    }

    private void criar(TextInputEditText nomeEditText, TextInputEditText cursoEditText, TextInputEditText dataNascEditText){
        Aluno aluno = new Aluno();
        aluno.setNome(nomeEditText.getEditableText().toString());
        aluno.setCurso(cursoEditText.getEditableText().toString());
        aluno.setDataNasc(cursoEditText.getEditableText().toString());

        alunosListener.cadastrarAluno(aluno);

    }

}
