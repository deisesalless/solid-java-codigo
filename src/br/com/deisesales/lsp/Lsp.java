package br.com.deisesales.lsp;

import java.util.List;

public class Lsp {
    public static void main(String[] args) {
        final Lsp lsp = new Lsp();
        lsp.executar();
    }

    public void executar() {

        final ManipuladorSaldo manipuladorComum = new ManipuladorSaldoComum();
        final ManipuladorSaldo manipuladorPremium = new ManipuladorSaldoPremium();
        final ManipuladorSaldo manipuladorSemRendimento = new ManipuladorSaldoSemRendimento();

        final var conta1 = new Conta(manipuladorComum);
        final var conta2 = new Conta(manipuladorPremium);
        final var conta3 = new Conta(manipuladorSemRendimento);

        conta1.depositar(100);
        conta2.depositar(100);
        conta3.depositar(100);

        final List<Conta> contas = List.of(conta1, conta2, conta3);

        contas.stream().peek(Conta::render)
                .forEach(conta -> System.out.println("Saldo da conta: " + conta.getSaldo()));
    }
}
