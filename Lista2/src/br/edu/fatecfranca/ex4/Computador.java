/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex4;

/**
 *
 * @author jaque
 */
public class Computador {
   public String processador;
   public static int ram;
   
   Computador(){
       this.processador = "";
   }
   Computador(String processador){
       this.processador = processador;
   }
   
   public void alteraProcesssador(String processador){
       this.processador = processador;
   }
   public static void alteraRam(int ram){
       Computador.ram = ram;
   }
   public static void upgrade(){
       Computador.ram += 256;
   }
   
}
