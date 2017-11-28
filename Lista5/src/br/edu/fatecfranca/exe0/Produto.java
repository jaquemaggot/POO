
package br.edu.fatecfranca.exe0;

public class Produto {
    //protected = publica para as filhas, privadas para as demais.
    protected String nome , descricao;
    protected float valor;

    public Produto() {
        this.nome = "";
        this.descricao = "";
        this.valor = 0;
                
    }

    public Produto(String nome, String descricao, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String mostra(){
        return "Nome" + this.nome +
                "\nDescrição" + this.descricao +
                "\nValor" + this.valor;
    }
    
}
