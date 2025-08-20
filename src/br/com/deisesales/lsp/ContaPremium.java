package br.com.deisesales.lsp;

public class ContaPremium extends Conta {

    @Override
    public void render() {
        this.manipuladorSaldo.render(0.1);
    }
}
