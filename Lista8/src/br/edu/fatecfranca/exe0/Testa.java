
package br.edu.fatecfranca.exe0;

public class Testa {

    public static void main(String[] args) {
        // TODO code application logic here
        PessoaA pa = new PessoaA();
        System.out.println(pa.beber());
        System.out.println(pa.comerDoce());
        
        PessoaB pb = new PessoaB();
        System.out.println( pb.beber());
        System.out.println( pb.comerDoce());
        System.out.println(pb.fumar());
       
        Diabetico di = new PessoaA();
        System.out.println(di.comerDoce());
        System.out.println(di.herdaPais());
        
        Alcoolatra al = new PessoaA();
        System.out.println(al.beber());
        
        Alcoolatra al2 = new PessoaB();
        System.out.println(al2.beber());
    }
    
}
