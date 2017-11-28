
package br.edu.fatecfranca.exe0;

public class Virtual extends Produto{
    private String emailEntrega;
    private float espacoHd,ramMinima;

    public Virtual(String emailEntrega, float espacoHd, float ramMinima, String nome, String descricao, float valor) {
        super(nome, descricao, valor);
        this.emailEntrega = emailEntrega;
        this.espacoHd = espacoHd;
        this.ramMinima = ramMinima;
    } 
    public Virtual() {
        super();
        this.emailEntrega = "";
        this.espacoHd = 0;
        this.ramMinima = 0;
    }
    public String getEmailEntrega() {
        return emailEntrega;
    }
    public void setEmailEntrega(String emailEntrega) {
        this.emailEntrega = emailEntrega;
    }
    public float getEspacoHd() {
        return espacoHd;
    }
    public void setEspacoHd(float espacoHd) {
        this.espacoHd = espacoHd;
    }
    public float getRamMinima() {
        return ramMinima;
    }
    public void setRamMinima(float ramMinima) {
        this.ramMinima = ramMinima;
    }
    @Override
    public String mostra(){//eu não te quero mas eu não te largo;
        return super.mostra() + "\nEmail" + this.emailEntrega 
                + "\n Espaço em Hd" + this.espacoHd 
                + "\n Ram minima" + this.ramMinima;
    }
    
}
