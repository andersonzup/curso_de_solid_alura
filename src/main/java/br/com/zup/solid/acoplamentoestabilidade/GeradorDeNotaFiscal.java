package br.com.zup.solid.acoplamentoestabilidade;

import java.util.List;

public class GeradorDeNotaFiscal {

    List<AcaoAposGerarNota> acoes;

    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
        acoes = List.of();
        acoes.stream().forEach(a -> a.executarAcao(nf));
        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
