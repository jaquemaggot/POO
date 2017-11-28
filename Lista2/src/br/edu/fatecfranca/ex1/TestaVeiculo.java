
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaVeiculo {
    /*
        this.tipo = "";
        this.nroRodas = 0;
        this.cor = "";
        this.ano = 0;
    */
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.tipo = JOptionPane.showInputDialog("Informe o tipo do carro");
        carro.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de rodas"));
        carro.cor = JOptionPane.showInputDialog("Informe a cor do carro");
        carro.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));
       
       Veiculo.nomeDono = JOptionPane.showInputDialog("Informe o nome do dono ");
       
        //String tipo,int nroRodas,String cor,int ano
       String tipo = JOptionPane.showInputDialog("Informe o tipo de moto");
       int nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de rodas"));
       String cor = JOptionPane.showInputDialog("Informe a cor da moto");
       int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano da moto"));
       
       Veiculo moto = new Veiculo(tipo,nroRodas,cor,ano);
       JOptionPane.showMessageDialog(null,carro.mostra());
       JOptionPane.showMessageDialog(null,moto.mostra());
       
       moto.tipo = "f";
       moto.nroRodas = 12;
       moto.cor = "azul";
       moto.ano = 2002;
       
       Veiculo.alteraNome("Marco");
       
       JOptionPane.showMessageDialog(null,carro.mostra());
       JOptionPane.showMessageDialog(null,moto.mostra());
       
       JOptionPane.showMessageDialog(null,Veiculo.nroRodas(20));
       JOptionPane.showMessageDialog(null,Veiculo.retornaNome());
       
       //JOptionPane.showMessageDialog(null,Veiculo.retornaNovoVeiculo(carro, moto).mostra());
       Veiculo obj3 = Veiculo.retornaNovoVeiculo(moto, carro);
       JOptionPane.showMessageDialog(null,obj3.mostra());
       
       String aux = Veiculo.nroRodas(moto.nroRodas);
       
    }
    
}
