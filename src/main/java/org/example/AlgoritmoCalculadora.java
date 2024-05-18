package org.example;


import java.util.Scanner;

public class AlgoritmoCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = 0;

        System.out.print("Escolha a operação: ");
        char operacao = scanner.next().charAt(0);
        String convertCharToString = Character.toString(operacao);
        switch (convertCharToString) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Não é permitido divisão por 0");
                } else {
                    resultado = num1 / num2;
                }

            }

        }
        System.out.println("Resultado: " + resultado);


    }
}
