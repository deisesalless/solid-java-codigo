package br.com.deisesales.ocp_dip;

import java.util.Collections;
import java.util.List;

public class Venda {
    private final String cliente;
    private final String tipoCliente;
    private final String estadoEntrega;

    private List<Item> itens;

    private double frete;
    private double desconto;

    public Venda(String cliente, String tipoCliente, String estadoEntrega, List<Item> itens) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.estadoEntrega = estadoEntrega;
        this.itens = itens;
    }

    public double getValorTotal() {
        return this.itens.stream()
                .mapToDouble(Item::valor).sum();
    }

    public String getCliente() {
        return cliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
