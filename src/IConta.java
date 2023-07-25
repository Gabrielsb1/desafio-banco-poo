public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double conta, IConta contaDestino);


    void imprimirExtrato();
}
