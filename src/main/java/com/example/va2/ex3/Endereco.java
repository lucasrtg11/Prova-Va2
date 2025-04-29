package com.example.va2.ex3;

public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero){
        this.rua = rua;
        this.numero = numero;
    }
    public String getrua(){
        return rua;
    }
    public int getnumero(){
        return numero;
    }
}
