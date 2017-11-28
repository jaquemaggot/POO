package br.edu.fatecfranca.exe0;
import javax.swing.JOptionPane;
public class Testa {
    public static void main(String[] args) {
        Produto p1 = new Produto("Casa","Térrea",80000);
        Virtual p2 = new Virtual("eu@eu.com",500,4,"LOL","yyyyyy",200);
        Fisico p3 = new Fisico("Franca",34343,3,"Sinuca","Sinuca kkkk",70);
        JOptionPane.showMessageDialog(null,p1.mostra());
        JOptionPane.showMessageDialog(null,p2.mostra());
        JOptionPane.showMessageDialog(null,p3.mostra());
    }
}
