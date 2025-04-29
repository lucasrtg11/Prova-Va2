package com.example.va2.ex3;

public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getnome(){
        return nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
}
