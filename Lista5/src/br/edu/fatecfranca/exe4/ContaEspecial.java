package br.edu.fatecfranca.exe4;
public class ContaEspecial extends Conta{
  
    public ContaEspecial(String nome, float salario, float saldo, float limite, int numConta) {
        super();
    }

    public ContaEspecial() {
        super();
    }
    
    @Override
    public float getLimite() {
        return limite;
    }

    @Override
    public void setLimite(float limite) {
        if(this.limite <= 3 * this.salario){
            this.limite = limite;
        }
    }
}
