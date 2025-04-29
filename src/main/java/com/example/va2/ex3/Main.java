package com.example.va2.ex3;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas", null);
        Endereco e1 = new Endereco("Rua A", 26);
        Produto p1 = new Produto("Teclado", 50.0);
        Produto p2 = new Produto("Fone", 100.0);

        Pedido pedido1 = new Pedido(c1);
        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.exibirResumo();
    }
}
