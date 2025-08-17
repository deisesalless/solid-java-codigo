package br.com.deisesales.ocp_dip;

public class Caixa {
    private final Correio correio;
    private final EmissorNf emissorNf;
    private final IntegraParaEstoque integraParaEstoque;

    public Caixa() {
        this.correio = new Correio();
        this.emissorNf = new EmissorNf();
        this.integraParaEstoque = new IntegraParaEstoque();
    }

    public Venda faturar(Venda venda) {

        // verifica o calculo do frete
        if (venda.getEstadoEntrega().equalsIgnoreCase("Parana")) {
            venda.setFrete(25);
        } else {
            venda.setFrete(50);
        }

        // verifica o calculo do desconto
        if (venda.getTipoCliente().equals("PF")) {
            venda.setDesconto(venda.getValorTotal() * 0.10);
        } else if (venda.getTipoCliente().equals("PJ")) {
            venda.setDesconto(venda.getValorTotal() * 0.05);
        } else {
            venda.setDesconto(venda.getValorTotal() * 0.02);
        }

        System.out.println("Venda faturada");

        // Responsabilidade única: emitir nota fiscal, enviar email e integrar estoque
        // seguindo o princípio Single Responsibility Principle (SRP)
        this.emissorNf.emitir(); // emitir nota fiscal
        this.correio.notificarCliente(); // disparar email para o cliente
        this.integraParaEstoque.integrar(); // dar baixa nos itens do estoque

        return venda;
    }
}
