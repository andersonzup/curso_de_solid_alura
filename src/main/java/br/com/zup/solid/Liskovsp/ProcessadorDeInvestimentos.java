package br.com.zup.solid.Liskovsp;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (Contas conta : contasDoBanco()) {
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<Contas> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double valor) {
        return new ContaDeEstudante(valor);
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum(valor);
        c.rende();
        return c;
    }
}