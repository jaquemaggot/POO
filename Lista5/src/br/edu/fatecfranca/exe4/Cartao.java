
package br.edu.fatecfranca.exe4;
public class Cartao extends Conta{
    protected String senha;

    public Cartao() {
        this.senha = "aq123";
    }
    
    public boolean retira(String senha){
        if(this.senha == senha){
           return this.saldo > 0;
        }    
        return false;
    }
    
    public String saldo(String senha){
        return "Seu saldo é: " + this.saldo;
    }
    
}
