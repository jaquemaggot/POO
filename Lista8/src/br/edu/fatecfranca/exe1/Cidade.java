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
public class Cidade {
    public String contrata(Professor p){
	return p.ensina() + " " + p.trabalha();
    }

    public String contrata(Empregado e){
            return e.trabalha();
    }

    public String cobraDe(Contribuinte c) {
           return c.pagaIR();
    }

    public String registra(Cidadao c) {
            return c.tiraRg();
    }

    public String alimenta(Animal a ){
            return a.come();
    }
}
