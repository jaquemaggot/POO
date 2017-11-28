package br.edu.fatecfranca.exe2;

public class Produto {
    protected int serial,volume;
    protected String teste = "nao testado";

    public Produto(int serial, int volume) {
        this.serial = serial;
        this.volume = volume;
    }
    public Produto() {
        this.serial = 1;
        this.volume = 2;
    }
    public int getSerial() {
        return serial;
    }
    public void setSerial(int serial) {
        this.serial = serial;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public boolean testaProduto(){
        if(Math.random() >= 0.9){
            this.teste = "Aprovado";
            return true;
        } 
        else{
            this.teste = "Reprovado";
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", teste=" + teste + '}';
    }
    
}
