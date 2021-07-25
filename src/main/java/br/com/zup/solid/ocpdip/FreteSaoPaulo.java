package br.com.zup.solid.ocpdip;

public class FreteSaoPaulo implements ServicoEntrega{

    @Override
    public double valorFrete(Enum<Cidade> cidade) {
        return 15;
    }
}
