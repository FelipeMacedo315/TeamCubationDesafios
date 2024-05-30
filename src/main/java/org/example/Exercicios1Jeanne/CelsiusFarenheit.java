package org.example.Exercicios1Jeanne;

import java.util.Scanner;

public class CelsiusFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a temperatura para converter");
        System.out.println("tecle C para converter de Celsius para Farenheit ");
        System.out.println("Tecle F para converter de Farenheit para Celsius");
        Character escolhido = scanner.next().charAt(0);
        System.out.println("Informe a temperatura");

        Integer temperatura = scanner.nextInt();

        Convert(escolhido, temperatura);
    }

    public static void Convert(Character choice, Integer num) {
        // celsius x farenheit
        if (choice == 'c') {
            int resultado = CalculoCelsius(num);
            MsgFinal(num + " graus Celsius são " + resultado + " Farenheits");
        }
        // fareinheit x celsius
        if (choice == 'f') {
            int resultado = CalculoFarenheit(num);
            MsgFinal(num + " graus Farenheits são " + resultado + " Celsius");
        }
    }

    public static int CalculoCelsius(int num) {
        return (num * 9) / 5 + 32;
    }

    public static int CalculoFarenheit(int num) {
        return (num - 32) * 5 / 9;
    }

    public static void MsgFinal(String msg) {
        System.out.println(msg);

    }
}
