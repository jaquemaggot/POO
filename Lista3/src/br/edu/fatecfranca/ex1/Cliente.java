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
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;
    
    //métodos construtores
    public Cliente(){
      this.nroConta = "000000-0";
      this.nroAgencia = "0000-0";
      this.nome = "";
      this.saldo = 0;
    }
    public Cliente(String nroConta,String nroAgencia,String nome, float saldo){
        this.trataNroConta(nroConta);
        this.trataNroAgencia(nroAgencia);
        this.trataNome(nome);
        this.saldo = saldo;
    }
    public String getNroConta(){
        return this.nroConta;
    }
    public String getNroAgencia(){
        return this.nroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setNroConta(String nroConta){
        this.trataNroConta(nroConta);
    }
    private void trataNroConta(String nroConta){
        if((nroConta.length() == 8) && (nroConta.charAt(6)==  '-')){
            this.nroConta = nroConta;
        }
        else throw new IllegalArgumentException("Número de conta inválida");
    }
    public void setNroAgencia(String nroAgencia){
        this.trataNroAgencia(nroAgencia);
    }
    private void trataNroAgencia(String nroAgencia){
        if((nroAgencia.length() == 6) && (nroAgencia.charAt(4)==  '-')){
            this.nroAgencia = nroAgencia;
        }
        else throw new IllegalArgumentException("Número de Agência inválida");
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
    private void trataNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome inválido");
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo = this.saldo + x;
    }
    public void sacar(float x){
        if(this.saldo - x >=0){
            this.saldo = this.saldo - x;
        }
        else throw new IllegalArgumentException("Saldo insuficiente");
    }
    public String mostra(){
        return " Número de conta: " + this.nroConta +
                "\n Número Agência " + this.nroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo: " + this.saldo;
    }
}
