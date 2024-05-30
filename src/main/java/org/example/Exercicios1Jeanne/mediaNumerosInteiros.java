package org.example.Exercicios1Jeanne;

import java.util.ArrayList;
import java.util.Scanner;

public class mediaNumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros");
        Integer soma = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        while (numeros.size() < 5) {
            Integer num = scanner.nextInt();
            numeros.add(num);

        }
        for (int i = 0; i < numeros.size(); i++) {
            soma = soma + numeros.get(i);
        }

        System.out.println("lista dos numeros que você digitou " + numeros);
        System.out.println("média dos numeros que você digitou " + soma / numeros.size());
    }
}
