/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

/**
 *numeroConta (String), numeroAgencia (String), nome (String) e static saldo (float), 
 * @author jaque
 */
public class Cliente {
    public String numeroConta;
    public String numeroAgencia;
    public String nome;
    static float saldo;
    
    Cliente(){
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
    }
    Cliente(String numeroConta, String numeroAgencia, String nome){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;  
    }
    //realizarDeposito() 
    public void realizarDeposito(float x){
        saldo += x;
    }
    public void realizarSaque(float x){
        saldo -= x;
    } 
    public String mostra(){
        return  "Nome: " + this.nome +
                "\n Número da conta: " + this.numeroConta +
                "\n Número Agência: " + this.numeroAgencia +
                "\n saldo: " + saldo;
    }
    static void alteraSaldo(float x){
        saldo += x;
    }
    static float retornaSaldo(){
        return saldo;
    }
    public String alteraAgencia(){
        return this.numeroAgencia = "X-64";
    }
    public String retornaAgencia(){
        return this.numeroAgencia;
    }
    static Cliente retornaNovoCliente(Cliente a, Cliente b){
        Cliente c = new Cliente();
        c.numeroConta = b.numeroConta;
        c.numeroAgencia = a.numeroAgencia;
        c.nome = "Fulano";
        c.saldo = a.saldo + b.saldo;
        return c;
    }
    static String  verificaTamanho(String numeroAgencia){
        //a.ano > b.ano ? a.ano : b.ano;
        return (numeroAgencia.length()) == 6 ? "Tamanho 6" : "Tamanho diferente de 6";
    }
       
}
