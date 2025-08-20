package br.com.deisesales.lsp;

public class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void sacar(int valor) {
        this.saldo -= valor;
    }

    public void render() {
        this.saldo += this.saldo * 0.05;
    }
}
