package br.com.zup.solid.srpcoesao;


public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcularSalario(funcionario);
    }

}


