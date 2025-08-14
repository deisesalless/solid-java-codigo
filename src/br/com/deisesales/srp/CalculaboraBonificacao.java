package br.com.deisesales.srp;

public class CalculaboraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {
        double bonificacao = 0;
        double salario = colaborador.salario();

        if (colaborador.cargo() == Cargo.GERENTE) {
            bonificacao = salario * 0.1; // 10% para gerentes
        } else if (colaborador.cargo() == Cargo.ANALISTA) {
            bonificacao = salario * 0.05; // 5% para analistas
        } else if (colaborador.cargo() == Cargo.DESENVOLVEDOR) {
            bonificacao = salario * 0.01; // 1% para desenvolvedores
        }

        return bonificacao;
    }
}
