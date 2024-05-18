package org.example;

public class Exercicio_1 {


    public void exercicio_1() {
        System.out.println("Exercicio - 1 ");
        double golTimeA = Math.round(Math.random() * 20);
        double golTimeB = Math.round(Math.random() * 20);
        System.out.println("Time A marcou " + golTimeA + " gols");
        System.out.println("Time A marcou " + golTimeB + " gols");
        if (golTimeA > golTimeB) {
            System.out.println("Time A fez " + golTimeA + "e ganhou");
        } else if (golTimeA < golTimeB) {
            System.out.println("Time B fez " + golTimeB + " e ganhou");

        } else {
            System.out.println("A partida terminou em empate");
        }
        System.out.println("________________________________________________________________________");
    }
}

