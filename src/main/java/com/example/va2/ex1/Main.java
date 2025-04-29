package com.example.va2.ex1;

public class Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Lucas", "123345670001-21");
        Produto p1 = new Produto("Skate", 300.0, f1);
        Produto p2 = new Produto("Capacete", 100.0, f1);
        f1.exibirInfo();
        p1.exibirInfo();
        p2.exibirInfo();
    }
}
