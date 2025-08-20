package br.com.deisesales.lsp;

public class ManipuladorSaldo {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void render(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return saldo;
    }
}
