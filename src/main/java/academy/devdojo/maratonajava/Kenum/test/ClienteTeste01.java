package academy.devdojo.maratonajava.Kenum.test;

import academy.devdojo.maratonajava.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

    }
}
