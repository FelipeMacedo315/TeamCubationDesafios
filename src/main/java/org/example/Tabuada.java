package org.example;

public class Tabuada {
    double num = Math.round(Math.random() * 100);
    int numInteiro = (int) num;
    public void tabuada() {
        for (int index = 0; index <= 10; index++) {
            System.out.println(numInteiro + " X " + index +" = " +  (numInteiro * index));
        }
    }
}
