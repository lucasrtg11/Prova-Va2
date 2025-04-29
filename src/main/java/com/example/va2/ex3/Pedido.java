package com.example.va2.ex3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getpreco();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("Resumo do Pedido:");
        System.out.println("Cliente: " + cliente.getnome());
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println("- " + p.getnome() + ": R$ " + String.format("%.2f", p.getpreco()));
        }
        System.out.println("Total: R$ " + String.format("%.2f", calcularTotal()));
    }
}
