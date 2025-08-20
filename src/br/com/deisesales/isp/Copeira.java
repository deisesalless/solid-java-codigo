package br.com.deisesales.isp;

public class Copeira extends Colaborador {

    public Copeira(String nome, String documento, int salario) {
        super(nome, documento, salario);
    }

    @Override
    double getComissao() {
        return 0;
    }
}
