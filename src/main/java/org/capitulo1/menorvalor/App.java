package org.capitulo1.menorvalor;


public class App {
    public static void main(String[] args) {

        Carro[] carros = {
                new Carro("Lamborghini", 1_000_000),
                new Carro("Jpe", 46_000),
                new Carro("Brasília", 16_000),
                new Carro("Smart", 46_000),
                new Carro("Fusca", 17_000),
        };

        int maisBarato = 0;

        int i = 0;
        for (i = 0; i <= 4; i++) {
            if (carros[i].preco < carros[maisBarato].preco) {
                maisBarato = i;
            }
        }
        System.out.println(carros[maisBarato]);
    }
}

