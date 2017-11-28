/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

/**
 *
 * @author jaque
 */
public class Passageiros {
    private String nome;
    private Reserva softup;

    public Passageiros() {
    }

    public Passageiros(String nome, Reserva softup) {
        this.nome = nome;
        this.softup = softup;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Reserva getSoftup() {
        return softup;
    }

    public void setSoftup(Reserva softup) {
        this.softup = softup;
    }
    
    @Override
    public String toString() {
        return "Passageiros{" + "nome=" + nome + ", softup=" + softup.toString() + '}';
    }
    
    
    
}
