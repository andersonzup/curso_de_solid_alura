package br.com.zup.solid.srpcoesao;

public class DezOuVintePorcento implements RegraDeCalculo{
    @Override
    public Double calcularSalario(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        } else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}
