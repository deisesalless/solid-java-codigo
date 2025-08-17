package br.com.deisesales.ocp_dip;

public final class Caixa {
    private final Correio correio;
    private final EmissorNf emissorNf;
    private final IntegraParaEstoque integraParaEstoque;

    public Caixa() {
        this.correio = new Correio();
        this.emissorNf = new EmissorNf();
        this.integraParaEstoque = new IntegraParaEstoque();
    }

    public Venda faturar(Venda venda, Transportadora transportadora) {

        /*
        * Responsabilidade: Calcular frete
        * atribuido a responsabilidade para a transportadora
        * seguindo o princípio Open/Closed Principle (OCP)
        * onde a classe Caixa não precisa ser modificada sendo FINAL
        * e a lógica de cálculo de frete pode ser estendida usando a interface Transportadora
        */
        venda.setFrete(transportadora.calcularFrete(venda));

        /*
        * Responsabilidade: Calcular desconto
        * atribuido a responsabilidade para o tipo de cliente
        * seguindo o princípio Open/Closed Principle (OCP)
        * onde a classe Caixa não precisa ser modificada sendo FINAL
        * e a lógica de cálculo de desconto pode ser estendida usando a enum TipoCliente
        */
        venda.setDesconto(
                venda.getTipoCliente().calcularDesconto(venda)
        );

        System.out.println("Venda faturada");

        /*
         * Responsabilidade única: emitir nota fiscal, enviar email e integrar estoque
         * seguindo o princípio Single Responsibility Principle (SRP)
         */
        this.emissorNf.emitir(); // emitir nota fiscal
        this.correio.notificarCliente(); // disparar email para o cliente
        this.integraParaEstoque.integrar(); // dar baixa nos itens do estoque

        return venda;
    }
}
