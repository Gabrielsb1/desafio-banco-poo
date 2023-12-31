package application;

import bancodigital.entities.Cliente;
import bancodigital.entities.Conta;
import bancodigital.entities.ContaCorrente;
import bancodigital.entities.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Conta cc = new ContaCorrente(gabriel);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(gabriel);

        cc.transferir(10, poupanca);

       	cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
