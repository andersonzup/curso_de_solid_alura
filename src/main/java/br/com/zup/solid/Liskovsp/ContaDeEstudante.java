package br.com.zup.solid.Liskovsp;

public class ContaDeEstudante implements Contas {

    ManipuladorDeSaldos manipuladorDeSaldos;
    private int milhas;


    public ContaDeEstudante(double depositoInicial) {
        deposita(depositoInicial);
        this.manipuladorDeSaldos = new ManipuladorDeSaldos();
    }

    public void deposita(double valor) {
        manipuladorDeSaldos.adiciona(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    public double getSaldo() {
        return manipuladorDeSaldos.getSaldo();
    }

}