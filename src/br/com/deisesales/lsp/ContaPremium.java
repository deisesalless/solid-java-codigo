package br.com.deisesales.lsp;

public class ContaPremium extends Conta {

    @Override
    public void render() {
        this.saldo += this.saldo * 0.10;
    }
}
