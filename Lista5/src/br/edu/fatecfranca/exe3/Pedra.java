package br.edu.fatecfranca.exe3;
public class Pedra extends Coisa{
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    
    @Override
    public String compara(Coisa c){
        String aux = c.quemSouEu(); //Polimorfismo
        switch(aux){
            case "Pedra" : return "Pedra empata Pedra";
            case "Tesoura" : return "Pedra ganha Tesoura"; 
            case "Papel" : return "Pedra perde Papel";
            default: return "Impossivel comparar";
        }
        
    }
}
