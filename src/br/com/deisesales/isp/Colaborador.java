package br.com.deisesales.isp;

public abstract class Colaborador {
    private String nome;
    private String documento;
    private double salario;

    public Colaborador(String nome, String documento, double salario) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
    }

    abstract double getComissao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public double getSalario() {
        return salario;
    }
}
