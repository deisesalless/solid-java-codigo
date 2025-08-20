package br.com.deisesales.lsp;

public class ContaUniversitaria extends Conta {

    @Override
    public void render() {
        this.manipuladorSaldo.render(0.0);
    }
}
