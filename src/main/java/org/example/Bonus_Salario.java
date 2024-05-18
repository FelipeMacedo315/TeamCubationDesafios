package org.example;

import java.util.Scanner;

public class Bonus_Salario {
    public void bonus_salario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu sálario ? ");
        int respondeSalary = scanner.nextInt();
        System.out.println("Quantos anos de empresa ?");
        int anosEmpresa = scanner.nextInt();
        int salarioComBonus;
        if (anosEmpresa > 5) {
            int bonus = (respondeSalary * 5) / 100;
            salarioComBonus = respondeSalary + bonus;
            System.out.println("Seu sálario com bonus de 5% é : " + salarioComBonus);
        } else {
            int bonus = (respondeSalary * 2) / 100;
            salarioComBonus = respondeSalary + bonus;
            System.out.println("Seu sálario com bonus de 2% é : " + salarioComBonus);
        }

    }
}
