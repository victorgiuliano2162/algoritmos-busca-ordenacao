package org.capitulo1.menorvalor;

public class Carro {
    public String nome;
    public int preco;

    Carro(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Modelo: " + nome + "\n" + "Preço: "+ preco;
    }
}
