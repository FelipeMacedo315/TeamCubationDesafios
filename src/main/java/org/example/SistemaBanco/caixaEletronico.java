package org.example.SistemaBanco;

import java.util.Scanner;

public class caixaEletronico {
    Scanner scanner = new Scanner(System.in);

    public void Funcionando() {
        System.out.println("Você já tem conta em nosso banco ?");
        System.out.println("Tecle 1 para sim e 2 para não");
        int temConta = scanner.nextInt();
        if (temConta == 2) {
            System.out.println("Otimo! vamos criar uma conta agora");
            System.out.println("Nome do titular:");
            String titular = scanner.next();

            System.out.println();
        }

    }
}
