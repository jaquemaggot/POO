
package br.edu.fatecfranca.exe1;

public class Pessoa extends Animal implements Cidadao,Contribuinte,Empregado,Professor{

    @Override
    public String vota() {
        return "Pessoa Votando...";
    }

    @Override
    public String tiraRg() {
        return "Pessoa Tirando Rg...";
    }

    @Override
    public String pagaIR() {
        return "Pessoa pagando IR...";
    }

    @Override
    public String getCpf() {
        return "Pessoa tirando CPF...";
    }

    @Override
    public String trabalha() {
        return "Pessoa trabalhando...";
    }

    @Override
    public String ensina() {
        return "Pessoa Ensinando";
    }

}
