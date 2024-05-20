package org.example.Exercicios1Jeanne;

import java.util.HashMap;
import java.util.HashSet;

public class exercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[]{2, 4, 3, 3, 8, 5, 6, 7, 0, 9};
        HashMap<Integer, Integer> convert = new HashMap<Integer, Integer>();

        for (int num : numeros) {
            convert.put(num, 0);
            if (convert.get(num) == 0) {
                convert.put(num, convert.get(num) + 1);
            }
        }
        System.out.println(convert.toString());
    }
}
/// TIVE DIFICULDADE COM A LÓGICA E PULEI PRO PRÓXIMO

