/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

/**
 *
 * @author jaque
 */
public class Passageiro {
    private String nome,cpf;
    private int poltrona;

    public Passageiro(String nome, String cpf, int poltrona) {
        this.nome = nome;
        this.cpf = cpf;
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cpf=" + cpf + ", poltrona=" + poltrona + '}';
    }
    

}
