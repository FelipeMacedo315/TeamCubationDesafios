package org.example.SistemaBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Banco {
    List<ContaBancaria> contas = new ArrayList<>();

    public Banco() {

    }

    public void adicionarConta(ContaBancaria contaBancaria) {
        this.contas.add(contaBancaria);

    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria contaBancaria : contas) {
            if (Objects.equals(contaBancaria.getNumeroConta(), numeroConta)) {
                System.out.println(contaBancaria.getNumeroConta() + " " + contaBancaria.getTitular() + " " + contaBancaria.getSaldo());
                return contaBancaria;
            }
        }
        return null;

    }


    public void listarContas() {
        for (ContaBancaria contaBancaria : contas) {
            System.out.println("Conta: " + contaBancaria.getNumeroConta() + " Titular: " + contaBancaria.getTitular() + " Saldo: " + contaBancaria.getSaldo());
        }
    }
}

