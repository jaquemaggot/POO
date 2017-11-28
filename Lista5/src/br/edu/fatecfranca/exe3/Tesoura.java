package br.edu.fatecfranca.exe3;
public class Tesoura extends Coisa {
    public String quemSouEu(){
        return "Tesoura";
    }
    
    @Override
    public String compara(Coisa c){
        String aux = c.quemSouEu(); //Polimorfismo
        switch(aux){
            case "Tesoura" : return "Tesoura empata Tesoura";
            case "Papel" : return "Tesoura ganha Papel";
            case "Pedra" : return "Tesoura perde Pedra";
            default: return "Impossivel comparar";
        }
        
    }
}
