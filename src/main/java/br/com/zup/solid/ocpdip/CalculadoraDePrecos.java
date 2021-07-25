package br.com.zup.solid.ocpdip;


    public class CalculadoraDePrecos {
        TabelaDePreco tabelaDePreco;
        ServicoEntrega servicoEntrega;

        public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoEntrega servicoEntrega) {
            this.tabelaDePreco = tabelaDePreco;
            this.servicoEntrega = servicoEntrega;
        }

        public double calcula(Compra produto) {
            double desconto = tabelaDePreco.precoPara(produto.getValor());
            double frete = servicoEntrega.valorFrete(produto.getCidade());
            return produto.getValor() * (1-desconto) + frete;
        }

    }


