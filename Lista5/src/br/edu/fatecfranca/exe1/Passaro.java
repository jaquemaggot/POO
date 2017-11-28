
package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Passaro extends Animal {
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,"Piu-Piu");
    }

    public Passaro(String nome) {
        super(nome);
    }

    public Passaro() {
        super();
    }
    
}
