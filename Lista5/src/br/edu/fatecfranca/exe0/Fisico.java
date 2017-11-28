
package br.edu.fatecfranca.exe0;

public class Fisico extends Produto {
    private String enderecoEntrega;
    private int codigoBarras;
    private float peso;

    public Fisico(String enderecoEntrega, int codigoBarras, float peso, String nome, String descricao, float valor) {
        super(nome, descricao, valor);
        this.enderecoEntrega = enderecoEntrega;
        this.codigoBarras = codigoBarras;
        this.peso = peso;
    }

    public Fisico() {
        super();
        this.enderecoEntrega = "";
        this.codigoBarras = 0;
        this.peso = 0;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String mostra(){
        return super.mostra() + "\nEndereço" + this.enderecoEntrega + 
                "\nCodigo de barras " + this.codigoBarras +
                "\nPeso" + this.peso;     
    }
}
