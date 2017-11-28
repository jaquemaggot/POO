
package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class TestaData {
    public static void main(String[] args) {
        try{
            Data obj1 = new Data();
            obj1.setDia(10);
            obj1.setDia(44);
            JOptionPane.showMessageDialog(null,"DIA: " + obj1.getDia());



            obj1.setMes(2);
            obj1.setMes(14);
             JOptionPane.showMessageDialog(null,"MES: " + obj1.getMes());
            obj1.setAno(2017);
            obj1.setAno(-30); 
            JOptionPane.showMessageDialog(null,"ANO: " + obj1.getAno());
        
        }
        catch(IllegalArgumentException mensagem){
            //Trata o erro - exceção;
            JOptionPane.showMessageDialog(null, mensagem.getMessage());
        }
    }
}
