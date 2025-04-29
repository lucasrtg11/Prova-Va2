package com.example.va2.ex3;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getnome(){
        return nome;
    }
    public double getpreco(){
        return preco;
    }
}
