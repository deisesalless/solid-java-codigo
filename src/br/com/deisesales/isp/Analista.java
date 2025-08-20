package br.com.deisesales.isp;

public class Analista extends Colaborador {

    public Analista(String nome, String documento, int salario) {
        super(nome, documento, salario);
    }

    @Override
    double getComissao() {
        return 0;
    }
}
