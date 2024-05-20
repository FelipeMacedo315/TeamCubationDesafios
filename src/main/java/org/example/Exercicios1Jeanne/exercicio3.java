package org.example.Exercicios1Jeanne;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva 5 nomes");
        String[] armazenarNomes = new String[5];
        String maiorNome = "";
        for (int i = 0; i < armazenarNomes.length; i++) {
            String nome = scanner.next();
            armazenarNomes[i] = nome;
        }
        for (int i = 0; i < armazenarNomes.length; i++) {
            if (armazenarNomes[i].length() > maiorNome.length()) {
                maiorNome = armazenarNomes[i];
            }
        }
        System.out.println("Maior nome é " + maiorNome);
    }
}
