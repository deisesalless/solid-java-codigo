package br.com.deisesales.srp;

public enum Cargo {
    ANALISTA {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.05; // 5% para analistas
        }
    },
    DESENVOLVEDOR {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.01; // 1% para desenvolvedores
        }
    },
    GERENTE {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.1; // 10% para gerentes
        }
    };

    public abstract double calculaBonificacao(double salarioBase);
}
