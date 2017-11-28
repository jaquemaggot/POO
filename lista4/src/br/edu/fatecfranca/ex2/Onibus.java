
package br.edu.fatecfranca.ex2;

import java.util.ArrayList;

public class Onibus {
    private String numero;
    private ArrayList<Passageiro> passageiros;

    public Onibus(String numero, ArrayList<Passageiro> passageiros) {
        this.numero = numero;
        this.passageiros = passageiros;
    }

    public Onibus() {
        this.passageiros = new ArrayList();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        String saida = "Onibus{" + "numero=" + numero + ", passageiros=";
        //para cada passageiro no ônibus;
        for(Passageiro passageiro: this.passageiros){
            saida = saida + passageiro;
        }
        return saida;
    }
    
    public void associaPassageiro(Passageiro passageiro){
        this.passageiros.add(passageiro);
    }
    //remove passageiro, com todos os atributos que ele tem.
    public boolean desvincularPassageiro(Passageiro passageiro){
        return this.passageiros.remove(passageiro);
    }  
    
    public boolean obterPassageiro(Passageiro passageiro){
        return this.passageiros.contains(passageiro);
    }  
    
    public boolean obterPassageiro(String cpf){
       for(Passageiro passageiro: this.passageiros){
           //verifica o cpf do passageiro.
           if(passageiro.getCpf().equals(cpf)){
               return true;
           }
       }
        return false;
    }  
    
    private int obterPosicaoPassageiro(Passageiro passageiro){
        return this.passageiros.indexOf(passageiro);
    }
    private int obterPosicaoPassageiro(String cpf){
        for(Passageiro passageiro: this.passageiros){
           //verifica o cpf do passageiro.
           if(passageiro.getCpf().equals(cpf)){
               return this.passageiros.indexOf(passageiro); 
           }
       }
        return -1;
    }
    
    public boolean atualizarPassageiro(Passageiro passageiro){
        int pos = obterPosicaoPassageiro(passageiro.getCpf());
        if(pos != -1){
            this.passageiros.set(pos, passageiro);
            return true;
        }
        else return false;
    } 
    
}
