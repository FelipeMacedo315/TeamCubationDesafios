package org.example.Exercicios1Jeanne;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Digite um número e verificaremos se ele é primo");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        if (isPrime(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }

    public static boolean isPrime(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
