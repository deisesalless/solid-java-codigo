package br.com.deisesales.ocp_dip;

import java.util.List;

public final class Caixa {
    private final List<AcoesAposFaturamento> acoesAposFaturamentoList;

    public Caixa(List<AcoesAposFaturamento> acoesAposFaturamentoList) {
        this.acoesAposFaturamentoList = acoesAposFaturamentoList;
    }

    public Venda faturar(Venda venda, Transportadora transportadora, TabelaDesconto tabelaDesconto) {

        /*
        * Responsabilidade: Calcular frete
        * atribuido a responsabilidade para a transportadora
        * seguindo o princípio Open/Closed Principle (OCP)
        * onde a classe Caixa não precisa ser modificada sendo FINAL
        * e a lógica de cálculo de frete pode ser estendida usando a interface Transportadora
        */
        venda.setFrete(transportadora.calcularFrete(venda));

        /*
        * Responsabilidade: Calcular desconto
        * atribuido a responsabilidade para o tipo de cliente
        * seguindo o princípio Open/Closed Principle (OCP)
        * onde a classe Caixa não precisa ser modificada sendo FINAL
        * e a lógica de cálculo de desconto pode ser estendida usando a enum TipoCliente
        */
        venda.setDesconto(
                tabelaDesconto.calcularDesconto(venda)
        );

        System.out.println("Venda faturada");

        /*
         * Responsabilidade única: emitir nota fiscal, enviar email e integrar estoque
         * seguindo o princípio Single Responsibility Principle (SRP)
         */
        acoesAposFaturamentoList.forEach(AcoesAposFaturamento::executarAcao);

        return venda;
    }
}
