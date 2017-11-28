/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

import java.util.ArrayList;

/**
 *
 * @author jaque
 */
public class Rodoviaria {
    private String cidade, nome;
    private ArrayList<Onibus> onibus;

    public Rodoviaria(String cidade, String nome, ArrayList<Onibus> onibus) {
        this.cidade = cidade;
        this.nome = nome;
        this.onibus = onibus;
    }

    public Rodoviaria() {
        this.onibus = new ArrayList();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Onibus> getOnibus() {
        return onibus;
    }

    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        String saida = "Rodoviaria{" + "cidade=" + cidade + ", nome=" + nome;
        for(Onibus onibus : this.onibus){
            saida = saida + onibus.toString() + "\n";
        }
        return saida;
    }
    
    public void associaOnibus(Onibus onibus) {
        this.onibus.add(onibus);
    }
    public boolean associaPassageiroOnibus(Onibus on,Passageiro pass) {
        if(this.onibus.contains(on)){
            on.associaPassageiro(pass);
            return true;
        }
        return false;
    }
    
    public boolean desvincularOnibus(Onibus onibus) {
        return this.onibus.remove(onibus);
    }
    public boolean desvincularPassageiroOnibus(Passageiro pas, Onibus on) {
        if(this.onibus.contains(on)){
            on.desvincularPassageiro(pas);
            return true;
        }
        return false;
    }
    public boolean obterOnibus(Onibus onibus) {
        return this.onibus.contains(onibus);
    }
    public boolean obterPassageiroOnibus(Onibus on, Passageiro pas) {
        if(this.onibus.contains(on)){
            return on.obterPassageiro(pas);
        }
        return false;
    }
    public boolean associaOnibus(String numero) {
        for(Onibus on: this.onibus){
            if(on.getNumero().equals(numero)){
                return true;
            }
        }
        return false;
    }
    public int obterPosicaoOnibus(Onibus onibus){
        return this.onibus.indexOf(onibus);
    }
    public int obterPosicaoOnibus(int numero){
        for(Onibus on: this.onibus){
            if(on.getNumero().equals(numero)){
                return this.onibus.indexOf(on);
            }
        }
        return -1;
    }
    public boolean atualizaOnibus(Onibus atual, Onibus novo){
        int pos = this.obterPosicaoOnibus(atual);
        if(pos != -1){
            this.onibus.set(pos, novo);
            return true;
        }
        else return false;
    }
    public boolean atualizaPassageiroOnibus(Onibus on, Passageiro passageiro){
        if(this.onibus.contains(on)){
            return on.atualizarPassageiro(passageiro);
        }
        return false;
    }
}
