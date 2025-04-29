package com.example.va2.ex2;

public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade){
        this.rua= rua;
        this.cidade = cidade;
    }

    public String getnrua(){
        return rua;
    }
    public String getcidade(){
        return cidade;
    }
    public void exibirDados(){
        System.out.println("Mora em " + getcidade() + " na " + getnrua());
    }
}
