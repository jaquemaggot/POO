package br.edu.fatecfranca.exe2;
public class Radio extends Produto {
    private String estacao = "94.9 ";
    private String banda = "FM";

    public Radio(String estacao,String banda,int serial, int volume) {
        super(serial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }

    public Radio() {
        super();
        this.estacao = "";
        this.banda = "";
    }

    public String escutar(){
        return this.estacao  + this.banda;
    }
    public void trocaEstacao(){
        this.estacao = "95.9";
    }
    public void trocaBanda(){
        this.banda = "AM";
    }
    @Override
    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", teste=" + teste + '}' +
               "Radio{" + "estacao=" + estacao + ", banda=" + banda +'}';
    }
    
    
    
}
