package br.com.digitalhouse.alunosrecyclerview.model;

import java.io.Serializable;
import java.util.Date;

public class Aluno implements Serializable {

    private String nome;
    private String curso;
    private String dataNasc;

    public Aluno(String nome, String curso, String dataNasc) {
        this.nome = nome;
        this.curso = curso;
        this.dataNasc = dataNasc;
    }
    public Aluno(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
