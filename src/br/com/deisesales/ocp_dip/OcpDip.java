package br.com.deisesales.ocp_dip;


import java.util.List;

public class OcpDip {
    public static void main(String[] args) {
        final OcpDip ocpDip = new OcpDip();
        ocpDip.executar();
    }

    public void executar() {
        final List<Item> itens = List.of(
                new Item("Camiseta", 1, 325),
                new Item("Caneca",1, 165),
                new Item("Livro",2, 189),
                new Item("Mouse",1, 499),
                new Item("Teclado",2, 100)
        );

        final Venda venda = new Venda("Deise Sales", TipoCliente.PF, "Parana", itens);

        final Caixa caixa = new Caixa();

        final Venda vendaFaturada = caixa.faturar(venda, new TransportadoraCORREIOS());

        System.out.println("O desconto da venda é: " + vendaFaturada.getDesconto());
        System.out.println("O valor do frente da venda é: " + vendaFaturada.getFrete());
    }
}
