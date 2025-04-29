package com.example.va2.ex2;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("CPU", 480);
        Curso c2 = new Curso("EF", 520);
        Endereco e1 = new Endereco("Rua A", "Varginha");
        Endereco e2 = new Endereco("Rua B", "TC");
        Aluno a1 = new Aluno("Lucas", c1, e1);
        Aluno a2 = new Aluno("Fernando", c2, e2);
        a1.exibirDados();
        e1.exibirDados();
        c1.exibirDados();
        a2.exibirDados();
        e2.exibirDados();
        c2.exibirDados();
    }
}
