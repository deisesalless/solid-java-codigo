package br.com.deisesales.srp;

import java.util.List;

public class Srp {
    public static void main(String[] args) {
        final Srp srp = new Srp();
        srp.executar();
    }

    public void executar() {
        final List<Colaborador> colaboradores = List.of(
          new Colaborador("João", 5000, Cargo.DESENVOLVEDOR),
          new Colaborador("Maria", 6000, Cargo.ANALISTA),
          new Colaborador("José", 7000, Cargo.GERENTE)
        );

        final CalculaboraBonificacao calculaboraBonificacao = new CalculaboraBonificacao();

        colaboradores.forEach(colaborador -> {
            System.out.printf("O colaborador %s com cargo %s tem uma bonificação de R$ %.2f%n",
                              colaborador.nome(),
                              colaborador.cargo(),
                              calculaboraBonificacao.calculaBonificacao(colaborador));
        });
    }
}
