package br.com.zup.solid.ocpdip;

class Compra{
    private String produto;
    private Enum<Cidade> cidade;
    private double valor;

    public Compra(String produto, Enum<Cidade> cidade, double valor) {
        this.produto = produto;
        this.cidade = cidade;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Enum<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(Enum<Cidade> cidade) {
        this.cidade = cidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


