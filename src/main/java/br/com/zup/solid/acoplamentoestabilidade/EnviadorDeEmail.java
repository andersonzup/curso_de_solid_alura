package br.com.zup.solid.acoplamentoestabilidade;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    public void enviaEmail(NotaFiscal nf){
        System.out.println("envia email da nf " + nf.getId());
    }

    @Override
    public void executarAcao(NotaFiscal notaFiscal) {
           enviaEmail(notaFiscal);
    }
}