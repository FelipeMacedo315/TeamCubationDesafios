package org.example;

public class Par_impar {

    public void par_impar() {
        double num = Math.round(Math.random() * 1000);
        System.out.println("Número aleátorio: " + num);
        System.out.println(num % 2 > 0 ? "Número impar" : "Número par");
    }
}
