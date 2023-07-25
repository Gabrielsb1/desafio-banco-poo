package bancodigital.entities;

import bancodigital.entities.Conta;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato bancodigital.entities.Conta Corrente ===");
        imprimirInfosComuns();
    }
}
