package br.com.zup.solid.ocpdip;

public enum Cidade {
    SAO_PAULO(new FreteSaoPaulo());

    private ServicoEntrega servicoEntrega;
    Cidade(ServicoEntrega servicoEntrega){
        this.servicoEntrega = servicoEntrega;
    }
}
