package org.example;

public class Exercicio_2 {
    double num = Math.round(Math.random() * 10) + 1;

    public void exercicio_2() {
        System.out.println("Exercicio - 2 ");
        if (num == 1) {
            System.out.println("Seu número é: " + num);
            System.out.println("Tu é goleiro e vai pro Gol");
        } else if (num >= 2 && num <= 5) {
            System.out.println("Seu número é: " + num);
            System.out.println("Fica na defesa");
        } else if (num >= 6 && num <= 10) {
            System.out.println("Seu número é: " + num);
            System.out.println("Fica no meio de campo");
        } else {
            System.out.println("Seu número é: " + num);
            System.out.println("Se você não foi chamado até agora, pode ir pro ataque");
        }
    }


}
