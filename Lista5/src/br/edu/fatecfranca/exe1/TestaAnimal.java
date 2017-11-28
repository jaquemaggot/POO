package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaAnimal {
    public static void main(String[] args) {
        //objetos Animal.
        Animal a1 = new Animal("Macaco");
        Animal a2 = new Animal("Macaco");
        Animal a3 = new Animal("Macaco");
        //obejtos Passaro
        Passaro p1 = new Passaro("Canario");
        Passaro p2 = new Passaro("Sarakura");
        Passaro p3 = new Passaro("Pardal");
        //objetos Mamifero
        Mamifero m1 = new Mamifero("baleia");
        Mamifero m2 = new Mamifero("macaco");
        Mamifero m3 = new Mamifero("onça");
        //objetos bem-te-vi
        BemTeVi b1 = new BemTeVi("kiko");
        BemTeVi b2 = new BemTeVi("Bob");
        BemTeVi b3 = new BemTeVi("Kagami");
        //objetos papagaio
        Papagaio pa1 = new Papagaio("Eu sou um papagaio muito fofo","Arnaldo");
        Papagaio pa2 = new Papagaio("Eu sou um papagaio","Fofão");
        Papagaio pa3 = new Papagaio("Falo Muitas Frases","Thiago");
        //objetos cachorro
        Cachorro c1 = new Cachorro(true,"Palito");
        Cachorro c2 = new Cachorro(true,"Pitico");
        Cachorro c3 = new Cachorro(true,"Kuroko");
        //objetos vaca
        Vaca v1 = new Vaca("Be");
        Vaca v2 = new Vaca("Bi");
        Vaca v3 = new Vaca("Bo");
        //objetos cachorro1
        Cachorro1 ca1 = new Cachorro1("Dalmata",true,"Pintado");
        //objetos cachorro2
        Cachorro2 ca2 = new Cachorro2("Preto e Branco",true,"Pintado");
        //Chamadas que dão erro
        //Papagaio pa1ex = new Papagaio("Eu sou um papagaio muito fofo");//Colocar apenas o vocabulario sem o nome.
        //Cachorro c1ex = new Cachorro(true);//Colocar apenas se late muito ou não.
        //Cachorro c1ex = new Cachorro("Palito");Colocar apenas o nome;
        
        //Animal
        JOptionPane.showMessageDialog(null,a1.imp());
        //Passaro
        JOptionPane.showMessageDialog(null,p1.imp());
        //Mamifero
        JOptionPane.showMessageDialog(null,m1.imp());
        //bem-te-vi
        JOptionPane.showMessageDialog(null,b1.imp());
        //papagaio
        JOptionPane.showMessageDialog(null,pa1.imp());
        //cachorro
        JOptionPane.showMessageDialog(null,c1.imp());
        //vaca
        JOptionPane.showMessageDialog(null,v1.imp());
       
        
        JOptionPane.showMessageDialog(null,"Fala dos Animais");
        a1.fala();
        p1.fala();
        m1.fala();
        b1.fala();
        pa1.fala();
        c1.fala();
        v1.fala();  
        
        //Teste dos novos métodos;
        JOptionPane.showMessageDialog(null,ca1.mostraInfo());
        JOptionPane.showMessageDialog(null,ca2.mostraInfo());
        
        ca1.alteraRaca();
        ca2.alteraCor(); 
    }
    
}
