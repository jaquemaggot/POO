/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex0;

import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author jaque
 */
public class TestaPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pedido p = new Pedido();
        p.setCodigo(100);
        p.setData(new Date());
        p.setValorTotal(300);
        p.setItemPedido(400, 3, 400);
        
        JOptionPane.showMessageDialog(null, p.toString());
    }
    
}
