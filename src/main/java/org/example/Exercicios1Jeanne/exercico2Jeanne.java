package org.example.Exercicios1Jeanne;

import java.util.Arrays;
import java.util.Scanner;

public class exercico2Jeanne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] armazenar = new float[5];
        System.out.println("Informe a altura de 5 pessoas");
        float maiorAltura = 0;

        for (int i = 0; i < armazenar.length; i++) {
            float altura = scanner.nextFloat();
            armazenar[i] = altura;
        }
        float menorAltura = armazenar[0];
        for (int i = 0; i < armazenar.length; i++) {
            if (armazenar[i] > maiorAltura) {
                maiorAltura = armazenar[i];
            }
            if (armazenar[i] < menorAltura) {
                menorAltura = armazenar[i];
            }

        }
        System.out.println("Alturas registradas");
        System.out.println(Arrays.toString(armazenar));
        System.out.println("Maior altura " + maiorAltura);
        System.out.println("Menor altura " + menorAltura);

    }
}
