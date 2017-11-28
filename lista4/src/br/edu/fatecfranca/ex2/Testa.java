/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author jaque
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passageiro p1 = new Passageiro("Fulano", "123",10);
        Passageiro p2 = new Passageiro("Rafa", "456",11);
        Passageiro p3 = new Passageiro("Pedro", "789",12);
        Passageiro p4 = new Passageiro("Junior", "145",13);
        
        Onibus o1 = new Onibus();
        o1.setNumero("F2");
        o1.associaPassageiro(p1);
        o1.associaPassageiro(p2);
        
        Onibus o2 = new Onibus();
        o2.setNumero("X2");
        o2.associaPassageiro(p3);
        o2.associaPassageiro(p4);
        
        Rodoviaria r1 = new Rodoviaria();
        r1.setCidade("Franca");
        r1.setNome("Rodo de Franca");
        r1.associaOnibus(o1);
        r1.associaOnibus(o2);
        JOptionPane.showMessageDialog(null, r1.toString());
        
    }
    
}
