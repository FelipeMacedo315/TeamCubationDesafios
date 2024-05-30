package org.example.SistemaBanco;

import java.util.Objects;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private Double saldo = 0.0;


    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Banco banco, String numeroConta, double valorDeposito) {
        ContaBancaria contaExata = banco.buscarConta(numeroConta);
        System.out.println("Valor antigo " + contaExata.getSaldo());
        System.out.println("valor do deposito " + valorDeposito);
        contaExata.setSaldo(contaExata.getSaldo() + valorDeposito);
        System.out.println("saldo atualizado " + contaExata.getSaldo());

    }


    public Boolean sacar(Banco banco, String numeroConta, double valorSaque) {
        ContaBancaria contaExata = banco.buscarConta(numeroConta);
        System.out.println(contaExata.getSaldo());
        if (Objects.equals(contaExata.getNumeroConta(), numeroConta)) {
            contaExata.setSaldo(contaExata.getSaldo() - valorSaque);
            System.out.println("saldo atualizado " + contaExata.getSaldo());
            return true;
        } else {
            System.out.println("O numero da conta que você informou não existe");
            return false;

        }
    }

    public Boolean transferir(Banco banco, String remetente, double valorTransferencia, String destinatario) {
        ContaBancaria contaRemet = banco.buscarConta(remetente);
        contaRemet.setSaldo(contaRemet.getSaldo() - valorTransferencia);
        System.out.println(contaRemet.getSaldo());
        ContaBancaria contaDest = banco.buscarConta(destinatario);
        contaDest.setSaldo(contaDest.getSaldo() + valorTransferencia);
        return true;
    }
}
