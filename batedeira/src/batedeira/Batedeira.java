/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batedeira;

/**
 *
 * @author jaque
 */
public class Batedeira {
    private int estado;
    private int velocidade;
    
    public Batedeira(){
        this.estado = 1;
        this.velocidade = 5;
    }
    public Batedeira(int velocidade, int estado){
        
    }
    public int getEstado(){
        return this.estado;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setEstado(int estado){
        this.trataEstado(estado);
    }
    private void trataEstado(int estado){
        if((estado == 1)||(estado == 0)){
            this.estado = estado;
        }else throw new IllegalArgumentException("Estado de batedeira inválido");
    }
    public void setVelocidade(int velocidade){
        this.trataVelocidade(velocidade);
    }
    //(5, 10, 15, 20). 
    public void trataVelocidade(int velocidade){
        if((velocidade == 0)||(velocidade == 5)||(velocidade == 10)||(velocidade == 15)||(velocidade == 20)){
            this.velocidade = velocidade;
        }else throw new IllegalArgumentException("Velocidade inválida");
    }
    public String desligaBatedeira(){
        this.estado = 0;
        this.velocidade = 0;
        return "O estado da Batedeira é: " + this.estado +
                "\n A velocidade da Batedeira é: " + this.velocidade;
        
    }
    public String aumentarVelocidade(int x){
        this.velocidade = this.velocidade * x;
        return " A velocidade da Batedeira é: " + this.velocidade;
    }
    static public Batedeira menorBatedeira(Batedeira a, Batedeira b){
        if(a.velocidade > b.velocidade){
            return b;
        }
        else{
            return a;
        }
    }
    public String mostra(){
        return "A velocidade da batedeira é: " + this.velocidade +
                "O estado da batedeira é: "  + this.estado;
    }
}
