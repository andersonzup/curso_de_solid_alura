package br.com.zup.solid.srpcoesao;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo{
    @Override
    public Double calcularSalario(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        } else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
