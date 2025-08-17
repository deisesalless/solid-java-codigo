package br.com.deisesales.ocp_dip;

public class TransportadoraTIM implements Transportadora {
    @Override
    public double calcularFrete(Venda venda) {
        return venda.getEstadoEntrega().equalsIgnoreCase("Parana") ? 25 : 50;
    }
}
