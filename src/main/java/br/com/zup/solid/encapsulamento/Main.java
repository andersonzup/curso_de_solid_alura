package br.com.zup.solid.encapsulamento;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       Fatura fatura = new Fatura("Anderson", 200);
        List<Boleto> boletos = List.of(new Boleto(50), new Boleto(150));
        ProcessadorDeBoletos processadorDeBoletos = new ProcessadorDeBoletos();
        processadorDeBoletos.processa(boletos, fatura);
        System.out.println(" " + fatura.getValor());
        System.out.println(fatura.isPago() ? "Fatura Paga": "Fatura aberta");
    }
}
