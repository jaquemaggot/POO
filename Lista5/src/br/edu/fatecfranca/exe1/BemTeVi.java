package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class BemTeVi extends Passaro{
    public BemTeVi() {
        super();
    }
    public BemTeVi(String nome) {
       super(nome);
    }
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"bem-te-vi");
    }
    
}

