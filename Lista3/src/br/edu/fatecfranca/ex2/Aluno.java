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
public class Aluno {
    private int idade;
    private String nome, numeroAluno;
    private float p1, p2;

    public Aluno(){
        this.numeroAluno = "123456";
        this.idade = 18;
        this.nome = "jaqueline";
        this.p1 = 10;
        this.p2 = 10;
    }
    public Aluno(String numeroAluno, int idade, String nome, float p1, float p2){
        this.trataNumeroAluno(numeroAluno);
        this.trataIdade(idade);
        this.trataNome(nome);
        this.trataP1(p1);
        this.trataP2(p2);
    }
    public String getNumeroAluno(){
        return this.numeroAluno;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    public void setNumeroAluno(String numeroAluno){
        this.trataNumeroAluno(numeroAluno);
    }
    private void trataNumeroAluno(String numeroAluno){
        if(numeroAluno.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else throw new IllegalArgumentException("Número de aluno inválido");
    }
    public void setIdade(int idade){
        this.trataIdade(idade);
    }
    private void trataIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
        else throw new IllegalArgumentException("Idade inválida");
    }
    public void setNome(String nome){
        this.trataNome(nome);
    }
    private void trataNome(String nome){
        if(nome.length() < 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome contém muitos caracteres");
    }
    public void setP2(float p2){
        this.trataP2(p2);
    }
    private void trataP2(float p2){
        if(p2 > 0){
            this.p2 = p2;
        }
        else throw new IllegalArgumentException("P2 é negativa");
    }
    public void setP1(float p1){
        this.trataP1(p1);
    }
    private void trataP1(float p1){
        if(p1 > 0){
            this.p1 = p1;
        }
        else throw new IllegalArgumentException("P1 é negativa");
    }
    
    public float notaFinal(int p1, int p2){
        return (p1+p2)/2;
    } 
    public String dadosAluno(){
        return " O número do Aluno é: " + this.numeroAluno +
                "\n O nome do Aluno é: " + this.nome +
                "\n A idade do Aluno é " + this.idade;
    }
    public String passou(int p1, int p2){
        if (this.notaFinal(p1, p2) > 6){
            return "Passou";
        }else{
            return "Reprovado";
        }
    }
    

}
