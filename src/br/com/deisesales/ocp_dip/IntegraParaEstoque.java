package br.com.deisesales.ocp_dip;

public class IntegraParaEstoque implements AcoesAposFaturamento {


    @Override
    public void executarAcao() {
        System.out.println("Atualização do estoque realizada com sucesso!");
    }
}
