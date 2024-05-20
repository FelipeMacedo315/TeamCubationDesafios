package org.example.Exercicios1Jeanne;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class exercicio1 {
    public static void main(String[] args) {
        int[] armazenar = new int[10];
        // inserir 10 numero aleatorios no array
        for (int i = 0; i <= 9; i++) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(50);
            armazenar[i] = numeroAleatorio;
        }
        System.out.println(Arrays.toString(armazenar));
        // somar todos os itens
        int total = 0;
        for (int i = 0; i < armazenar.length; i++) {
            total += armazenar[i];
        }
        System.out.println("Os números aleatórios foram " + Arrays.toString(armazenar));
        System.out.println("e o resultado de todos eles somados é " + total);
    }
}
