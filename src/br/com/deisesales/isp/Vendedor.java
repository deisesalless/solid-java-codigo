package br.com.deisesales.isp;

public class Vendedor extends Colaborador {

    public Vendedor(String nome, String documento, int salario) {
        super(nome, documento, salario);
    }

    @Override
    double getComissao() {
        return super.getSalario() * 0.1;
    }
}
