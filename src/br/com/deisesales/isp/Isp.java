package br.com.deisesales.isp;

import java.util.List;

public class Isp {
    public static void main(String[] args) {
        final Isp isp = new Isp();
        isp.executar();
    }

    private void executar() {
        final var analista = new Analista("Deise", "123", 1000);
        final var copeira = new Copeira("Maria", "789", 1000);

        final var vendedor1 = new Vendedor("Lidia", "456", 1500);
        final var vendedor2 = new Vendedor("Gabriela", "456", 1500);

        final List<Comissionavel> colaboradores = List.of(vendedor1, vendedor2);

        colaboradores.forEach(colaborador -> System.out.printf("A comissão é de : " +
                colaborador.getComissao()).println());
    }


}
