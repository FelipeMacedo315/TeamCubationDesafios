package org.example;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Notas_Musicais {

    public void notas_musicais() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha suas notas musicais! ");
        System.out.println("As opções são: A,B,C,D,F");
        String notaEscolhida = scanner.next();
        switch (notaEscolhida) {
            case "A" -> System.out.println("Dó");
            case "B" -> System.out.println("Ré");
            case "C" -> System.out.println("Mi");
            case "D" -> System.out.println("Fá");
            case "E" -> System.out.println("Sól");
            case "F" -> System.out.println("Lá");
            default -> System.out.println("Escolha somente entre uma das opções acima");
        }
    }
}
