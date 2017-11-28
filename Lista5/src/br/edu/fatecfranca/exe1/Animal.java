
package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public Animal() {
        this.nome = "";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void fala(){
        JOptionPane.showMessageDialog(null,"Eu não Falo");
    }
    public String imp(){
        return "Nome do Animal: " + this.nome + 
                "\n Classe do animal:  " + this.getClass().getSimpleName();
    }
}
