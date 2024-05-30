package org.example.Exercicios1Jeanne;

import java.util.Scanner;

public class CalculadoraUsandoFuncoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero1 = null;
        Integer numero2 = null;
        Character opera = null;
        System.out.println("CALCULADORA");
        numero1 = scanner.nextInt();
        opera = scanner.next().charAt(0);
        numero2 = scanner.nextInt();


        Calcula(numero1, opera, numero2);
    }

    public static void Calcula(Integer num1, char operador, Integer num2) {
        Integer resultado = null;
        switch (operador) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> resultado = num1 / num2;
        }

        System.out.println("Resultado: " + resultado);
    }

}
