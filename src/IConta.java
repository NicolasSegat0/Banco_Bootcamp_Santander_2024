public interface IConta {
    void sacar(double valor);

    abstract void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
}
