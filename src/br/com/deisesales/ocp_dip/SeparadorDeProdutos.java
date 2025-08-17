package br.com.deisesales.ocp_dip;

public class SeparadorDeProdutos implements AcoesAposFaturamento {
    @Override
    public void executarAcao() {
        System.out.println("Produtos do cliente separados para entrega com sucesso!");
    }
}
