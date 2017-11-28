package br.edu.fatec.franca.exe1;
public class Passageiro {
    protected String nome,tipo;
    protected int poltrona;

    public Passageiro(String nome, int poltrona) {
        this.nome = nome;
        this.poltrona = poltrona;
    }

    public Passageiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
    public String emitePassageiro(){
        return "Classe do Passageiro:  " + this.getClass().getSimpleName();
    }
    
}
