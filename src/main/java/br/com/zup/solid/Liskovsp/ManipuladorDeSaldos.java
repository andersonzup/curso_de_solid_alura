package br.com.zup.solid.Liskovsp;

public class ManipuladorDeSaldos {
    private double saldo;

    public void adiciona(double valor){
        this.saldo += valor;
    }
    public void saca(double valor){
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }
    public void juros(double taxa){
        this.saldo += this.saldo * taxa;
    }

    public double getSaldo() {
        return saldo;
    }

}
