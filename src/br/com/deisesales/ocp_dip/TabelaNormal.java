package br.com.deisesales.ocp_dip;

public class TabelaNormal implements TabelaDesconto {

    @Override
    public double calcularDesconto(Venda venda) {
        /*
        * Implementação do cálculo de desconto para tabela normal de acordo com o
        * tipo de cliente na classe TipoCliente
        * Responsabilidade: Calcular desconto
        * seguindo o princípio Open/Closed Principle (OCP)
        * */
        return venda.getTipoCliente().calcularDesconto(venda);
    }
}
