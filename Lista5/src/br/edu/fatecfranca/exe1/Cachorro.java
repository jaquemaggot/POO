package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Cachorro extends Mamifero{
    protected boolean lateMuito;
    
    public Cachorro(boolean lateMuito, String nome) {
        super(nome);
        this.lateMuito = lateMuito;
    }
    public Cachorro() {
        super();
        this.lateMuito = true;
    }
    
    public boolean getLateMuito() {
        return lateMuito;
    }
    public void setLateMuito(boolean lateMuito) {
        this.lateMuito = lateMuito;
    }
    public void setLatePouco(boolean latePouco) {
        this.lateMuito = latePouco;
    }
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"Au au au");
    }  
}
