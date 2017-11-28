package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Cachorro1 extends Cachorro {
    private String raca;

    public Cachorro1(String raca, boolean lateMuito, String nome) {
        super(lateMuito, nome);
        this.raca = raca;
    }

    public Cachorro1(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void alteraRaca(){
        this.raca = "Dalmata";
    }
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"Eu sou um cachorro que Mia");
    }  
    public String mostraInfo(){
        return  super.imp() +
                "O cachorro late muito:  " + this.lateMuito +
                "Qual a raça do Animal: " + this.raca;          
    }
}
