package br.com.deisesales.ocp_dip;

public class CorreioEletronico implements AcoesAposFaturamento {
    @Override
    public void executarAcao() {
        System.out.println("Cliente notificado por email com sucesso!");
    }
}
