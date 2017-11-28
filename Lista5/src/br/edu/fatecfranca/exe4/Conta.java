package br.edu.fatecfranca.exe4;
public class Conta {
    protected String nome;
    protected float salario,saldo,limite;
    protected int numConta;

    public Conta() {
        this.nome = "Arnaldo";
        this.salario = 1000;
        this.saldo = 500;
        this.limite = 900;
        this.numConta = 10;  
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if(this.limite <= this.salario){
           this.limite = limite; 
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public void deposito(float valor){
        this.saldo = this.saldo + valor; 
    }
    
    public boolean retira(){
        return this.saldo > 0;
    }
    
    public String saldo(){
        return "Seu saldo é: " + this.saldo;
    }
    
}
