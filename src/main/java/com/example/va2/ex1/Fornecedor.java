package com.example.va2.ex1;

public class Fornecedor {
    private String nome;
    private String cnpj;

    public Fornecedor (String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getnome(){
        return nome;
    }
    public String getcnpj(){
        return cnpj;
    }
    public void exibirInfo(){
        System.out.println("O fornecedor " + getnome() + "do CNPJ " + getcnpj());
    }
}
