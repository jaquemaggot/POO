
package br.edu.fatec.franca.exe1;
public class Standard extends Passageiro{
    private String tipoLanche;
    
    public Standard(String tipoLanche, String nome, int poltrona) {
        super(nome, poltrona);
        this.tipoLanche = tipoLanche;
    }
    public Standard() {
        super();
        this.tipoLanche = "Lanche";
    }
    public String getTipoLanche() {
        return tipoLanche;
    }
    public void setTipoLanche(String tipoLanche) {
        this.tipoLanche = tipoLanche;
    }
}
