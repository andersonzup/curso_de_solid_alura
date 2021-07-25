package br.com.zup.solid.Liskovsp;

public class ContaComum implements Contas {

    private ManipuladorDeSaldos manipuladorDeSaldos;

    public ContaComum(double depositoInicial) {
        deposita(depositoInicial);
        this.manipuladorDeSaldos = new ManipuladorDeSaldos();
    }


    public void deposita(double valor) {
        manipuladorDeSaldos.adiciona(valor);
    }

    public void saca(double valor) {
        manipuladorDeSaldos.saca(valor);
    }

    public void rende() {
        manipuladorDeSaldos.juros(0.1);
    }

    public double getSaldo() {
        return manipuladorDeSaldos.getSaldo();
    }

}