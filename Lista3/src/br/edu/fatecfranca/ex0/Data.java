/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex0;

/**
 *
 * @author jaque
 */
public class Data {
    private int dia,mes,ano;
    
    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 2017;
    }
    public Data(int dia,int mes,int ano){
        this.trataDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }
    private void trataDia(int dia){
        if((dia >= 1) && (dia <= 31)){
            this.dia = dia;
        }
        else throw new IllegalArgumentException("Dia inválido");    
    }
    
    public void setDia(int dia){
       this.trataDia(dia);
    }
    //Tratamento do Mês;
    public void trataMes(int mes){
        if((mes >= 1) && (mes <= 12)){
            this.mes = mes; 
        }
        else throw new IllegalArgumentException("Mês inválido");
    }
    public void setMes(int mes){
        this.trataMes(mes);
    }
    //Tratamento do Ano;
    public void trataAno(int ano){
        if((ano >= 1) && (ano <= 31)){
            this.ano = ano; 
        }
        else throw new IllegalArgumentException("Ano inválido");
    }
    public void setAno(int ano){
        this.trataAno(ano);
    }
    
    public int getDia(){
        return this.ano;        
    }
    public int getMes(){
        return this.ano;        
    }
    public int getAno(){
        return this.ano;        
    }
    
    
}
