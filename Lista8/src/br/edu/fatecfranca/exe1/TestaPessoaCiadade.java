/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author jaque
 */
public class TestaPessoaCiadade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa fulano = new Pessoa();
	Cidade Franca = new Cidade();
	Franca.contrata(fulano);
        //Coerção = estou transformando um obejto de uma classe em outra classe.
	Franca.contrata((Empregado) fulano);
	Franca.cobraDe(fulano);
	Franca.registra(fulano);
	Franca.alimenta(fulano);

    }
    
}
