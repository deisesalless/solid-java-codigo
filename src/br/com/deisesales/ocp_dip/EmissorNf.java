package br.com.deisesales.ocp_dip;

public class EmissorNf implements AcoesAposFaturamento {


    @Override
    public void executarAcao() {
        System.out.println("Nota fiscal emitida com sucesso!");
    }
}
