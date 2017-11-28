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
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numeroConta (String), numeroAgencia (String), nome (String) e static saldo (float), 
        Cliente fulano = new Cliente();
        fulano.numeroConta = JOptionPane.showInputDialog("Informe o número da conta: ");
        fulano.numeroAgencia = JOptionPane.showInputDialog("Informe o número da Agência: ");
        fulano.nome = JOptionPane.showInputDialog("Informe o nome: ");
        
        fulano.realizarDeposito(100);
        fulano.realizarSaque(50);
        String numeroConta = JOptionPane.showInputDialog("Informe o número da conta");
        String numeroAgencia = JOptionPane.showInputDialog("Informe o número da conta");
        String nome = JOptionPane.showInputDialog("Informe o nome do cliente");
        
        Cliente beltrano = new Cliente(numeroConta,numeroAgencia,nome);
        
        JOptionPane.showMessageDialog(null,fulano.mostra());
        
        JOptionPane.showMessageDialog(null,beltrano.mostra());
        JOptionPane.showMessageDialog(null,Cliente.retornaNovoCliente(fulano, beltrano).mostra());
        JOptionPane.showMessageDialog(null,Cliente.verificaTamanho(numeroAgencia));
        
        
        
        

        
    }
    
}
