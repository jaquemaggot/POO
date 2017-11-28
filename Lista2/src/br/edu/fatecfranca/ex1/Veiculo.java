
package br.edu.fatecfranca.ex1;
public class Veiculo {
    public String tipo;
    public int nroRodas;
    public String cor;
    public int ano;
    public static String nomeDono;
    
    Veiculo(){
        this.tipo = "";
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;
    }
    Veiculo(String tipo,int nroRodas,String cor,int ano){
        this.tipo = tipo;
        this.nroRodas = nroRodas;
        this.cor = cor;
        this.ano = ano;
    }
    
    public void alteraTipo(String aux){
        this.tipo = aux;
    }
    public String mostra(){
        return " O veiculo tem tipo: " + this.tipo +
                "\n O número de rodas é: " + this.nroRodas +
                "\n A cor do veiculo é: " + this.cor +
                "\n O ano do veiculo é: " + this.ano +
                "\n O nome do dono:  " + Veiculo.nomeDono;
    }
    
    static void alteraNome(String nome){
        Veiculo.nomeDono = nome;
    }
    
    static String retornaNome(){
        return Veiculo.nomeDono;
    }
    
    static String nroRodas(int a){ 
        return a % 2 == 0 ? "Par" :  "Impar";  
    }
    
    static Veiculo retornaNovoVeiculo(Veiculo a, Veiculo b){
        Veiculo c = new Veiculo();
        c.tipo = a.tipo;
        c.nroRodas = ((a.nroRodas) + (b.nroRodas));
        c.cor = b.cor;
        c.ano = a.ano > b.ano ? a.ano : b.ano;
        return c;
    }
    
    
              
}
