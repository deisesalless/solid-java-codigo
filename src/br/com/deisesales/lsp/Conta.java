package br.com.deisesales.lsp;

public class Conta {
    protected final ManipuladorSaldo manipuladorSaldo;

    public Conta(ManipuladorSaldo manipuladorSaldo) {
        this.manipuladorSaldo = manipuladorSaldo;
    }

    public double getSaldo() {
        return manipuladorSaldo.getSaldo();
    }

    public void depositar(int valor) {
        manipuladorSaldo.depositar(valor);
    }

    public void sacar(int valor) {
        manipuladorSaldo.sacar(valor);
    }

    public void render() {
        manipuladorSaldo.render();
    }
}
