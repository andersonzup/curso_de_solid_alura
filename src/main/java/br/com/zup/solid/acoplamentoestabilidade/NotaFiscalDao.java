package br.com.zup.solid.acoplamentoestabilidade;

public class NotaFiscalDao implements AcaoAposGerarNota {

    public void persiste(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

    @Override
    public void executarAcao(NotaFiscal notaFiscal) {
        persiste(notaFiscal);
    }
}