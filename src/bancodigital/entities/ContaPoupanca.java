package bancodigital.entities;

import bancodigital.entities.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato bancodigital.entities.Conta Poupança ===");
        imprimirInfosComuns();
    }


}
