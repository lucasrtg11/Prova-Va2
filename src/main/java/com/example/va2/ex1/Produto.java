package com.example.va2.ex1;

public class Produto {
    private String nome;
    private double preco;
    private Fornecedor fornecedor;

    public Produto(String nome, double preco, Fornecedor fornecedor){
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getnome(){
        return nome;
    }
    public double getpreco(){
        return preco;
    }
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    public void exibirInfo(){
        System.out.println("Escolheu " + getnome() + " que custa " + getpreco());
    }
}
