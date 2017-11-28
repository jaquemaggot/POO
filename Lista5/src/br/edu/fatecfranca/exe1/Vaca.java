package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Vaca extends Mamifero{
    public Vaca(String nome) {
        super(nome);
    }
    public Vaca() {
        super();
    }
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"Muuuuuuuu");
    }
}
