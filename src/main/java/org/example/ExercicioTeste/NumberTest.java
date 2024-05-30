package org.example.ExercicioTeste;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class NumberTest {
    Number number = new Number();

    @Test
    void TestDividirPorTres() {

        boolean dividirPorTres = number.ReceberNumero() % 3 == 0;
        assertTrue(dividirPorTres);
        System.out.println("FIZZ");

    }

    @Test
    void TestDividirPorCinco() {
        boolean dividirPorCinco = number.ReceberNumero() % 5 == 0;
        assertTrue(dividirPorCinco);
        System.out.println("BUZZ");
    }

    // dividi por 5 e por 3
    @Test
    void TestDividirPorTodos() {
        boolean resultado = false;
        if (number.ReceberNumero() % 5 == 0 && number.ReceberNumero() % 3 == 0) {
            System.out.println("FIZZBUZZ");
            resultado = true;
        }
        assertTrue(resultado);
    }
}
