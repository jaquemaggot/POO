package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Cachorro2 extends Cachorro{
    private String cor;
    public Cachorro2(String cor, boolean lateMuito, String nome) {
        super(lateMuito, nome);
        this.cor = cor;
    }
    public Cachorro2() {
        super();
        this.cor = "";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void alteraCor(){
        this.cor = "Amarelo";
    }
    
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"Eu sou um cachorro que fala");
    }  
    
    public String mostraInfo(){
        return super.imp() +
                "O cachorro late muito:  " + this.lateMuito +
                "Qual a cor do Animal: " + this.cor;          
    }
    
}
