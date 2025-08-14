package br.com.deisesales.srp;

public class CalculaboraBonificacao {

    public double calculaBonificacao(Colaborador colaborador) {
        return colaborador.cargo()
                .calculaBonificacao(colaborador.salario());
    }
}
