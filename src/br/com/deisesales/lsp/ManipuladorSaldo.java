package br.com.deisesales.lsp;

public interface ManipuladorSaldo {

    void depositar(double valor);
    void sacar(double valor);
    void render();
    double getSaldo();
}
