
package br.edu.fatecfranca.exe2;
public class Controle {
    public static void main(String[] args) {
        Produto p1 = new Produto(12345,10);
        Radio r1 = new Radio("98.0","FM",123,10);
        Tv t1 = new Tv("Record",1234,20);
        
        p1.testaProduto();
        p1.toString();
        
        r1.escutar();
        r1.trocaEstacao();
        r1.trocaBanda();
        r1.toString();
        
        t1.assistir();
        t1.trocaCanal();
        t1.toString();
    }
}
