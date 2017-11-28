/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

/**
 *
 * @author jaque
 */
public class TestaComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computador obj1 = new Computador();
        obj1.processador = JOptionPane.showInputDialog("Informe o processador");
        String processador = JOptionPane.showInputDialog("Informe o processador");
        Computador obj2 = new Computador(processador);
        obj1.alteraProcesssador("processador 2");
        Computador.alteraRam(4);
     
    }
    
}
