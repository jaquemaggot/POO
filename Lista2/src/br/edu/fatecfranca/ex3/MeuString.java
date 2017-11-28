/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex3;

/**
 *
 * @author jaque
 */
public class MeuString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Método de instância
        String str1 = "Informe o nome do cliente";
        int comprimento = str1.length();
        //Método de classe
        char caracter = str1.charAt(2);
        //Método de classe
        String str2 = String.valueOf(comprimento);
                
    }
    
}
