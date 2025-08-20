package br.com.deisesales.isp;

public class Vendedor extends Colaborador implements Comissionavel{

    public Vendedor(String nome, String documento, int salario) {
        super(nome, documento, salario);
    }

    @Override
    public double getComissao() {
        return getSalario() * 0.1; // 10% de comissão sobre o salário
    }
}
