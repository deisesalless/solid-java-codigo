package br.com.deisesales.ocp_dip;

public enum TipoCliente {
    PF {
        @Override
        public double calcularDesconto(Venda venda) {
            return venda.getValorTotal() * 0.10;
        }
    },

    PJ {
        @Override
        public double calcularDesconto(Venda venda) {
            return venda.getValorTotal() * 0.05;
        }
    };

    public abstract double calcularDesconto(Venda venda);
}
