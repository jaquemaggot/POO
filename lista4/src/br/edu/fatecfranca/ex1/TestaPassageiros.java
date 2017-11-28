/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jaque
 */
public class TestaPassageiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> viajem = new ArrayList();
        
        viajem.add("Passageiro: Junior; Voo: 3001; Reserva:10");
        viajem.add("Passageiro: Matheus; Voo: 3001; Reserva:11");
        viajem.add("Passageiro: Leonardo; Voo: 3001; Reserva:12");
        
        
        viajem.remove(2);
        
        
        Voo voo = new Voo();
        voo.setDestino("Londres");
        voo.setNumero("3001");
        Reserva reserva = new Reserva();
        reserva.setCodigo(10);
        reserva.setVoo(voo);
        Passageiros equipe = new Passageiros();
        equipe.setNome("Equipe");
        equipe.setSoftup(reserva);
        System.out.println(viajem.toString());
        
        
        JOptionPane.showMessageDialog(null, equipe.toString());
        
    }
    
}
