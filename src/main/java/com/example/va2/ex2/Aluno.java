package com.example.va2.ex2;

public class Aluno {
    private String nome;
    private Curso curso;
    private Endereco endereco;

    public Aluno(String nome, Curso curso, Endereco endereco){
        this.nome = nome;
        this.curso = curso;
        this.endereco = endereco;
    }

    public String getnome(){
        return nome;
    }
    public Curso getCurso(){
        return curso;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void exibirDados(){
        System.out.println("O aluno " + getnome());
    }
}
