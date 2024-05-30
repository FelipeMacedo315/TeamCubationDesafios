package org.example.SistemaBanco;

public class Main {
    public static void main(String[] args) {
        // cria uma nova conta e atribui a classe Banco
        ContaBancaria contaBancaria = new ContaBancaria();
        Banco banco = new Banco();

        banco.adicionarConta(new ContaBancaria("felipe", "1200-4005", 1500));
        banco.adicionarConta(new ContaBancaria("asenjo", "1200-4010", 10000));

        // Imprimi todas as contas criadas
        banco.listarContas();

        // Retorna a conta em hash, mas o método imprimi as informações da conta
        System.out.println(banco.buscarConta("1200-4005"));
        contaBancaria.depositar(banco, "1200-4005", 100);

        // Saque
        contaBancaria.sacar(banco, "1200-4005", 300);

        // Transferir
        contaBancaria.transferir(banco, "1200-4005", 250, "1200-4010");
        banco.listarContas();

    }
}
