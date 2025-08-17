package br.com.deisesales.ocp_dip;

public class TabelaPromocional implements TabelaDesconto {
    @Override
    public double calcularDesconto(Venda venda) {
        var descontoNormal = venda.getTipoCliente().calcularDesconto(venda);

        /*
        * Aplicando 2% de desconto adicional para tabela normal independente
        * do tipo de cliente
        */
        return descontoNormal + descontoNormal * 0.02;
    }
}
