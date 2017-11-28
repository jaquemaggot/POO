
package br.edu.fatecfranca.exe2;
public class Tv extends Produto {
    private String canal;

    public Tv(String canal, int serial, int volume) {
        super(serial, volume);
        this.canal = canal;
    }

    public Tv() {
        super();
        this.canal = "SBT";
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
    
    public String assistir(){
        return this.canal;
    }
    public void trocaCanal(){
        this.canal = "Globo";
    }
    
    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", teste=" + teste + '}' +
               "TV{" + "canal=" + canal +'}';
    }
    
}
