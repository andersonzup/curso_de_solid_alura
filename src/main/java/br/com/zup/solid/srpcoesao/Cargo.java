package br.com.zup.solid.srpcoesao;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorcento())
    , DBA(new QuinzeOuVinteCincoPorcento())
    , TESTER(new QuinzeOuVinteCincoPorcento())
    , TECHLEAD(new DezOuVintePorcento());


    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}