package br.edu.fatecfranca.exe1;
import javax.swing.JOptionPane;

public class Papagaio extends Passaro{
    private String vocabulario;
    public Papagaio(String vocabulario, String nome) {
        super(nome);
        this.vocabulario = vocabulario;
    }
    public Papagaio(){
        super();
        this.vocabulario = "Eu sou um papagaio muito fofo";
    }
    @Override
    public void fala(){
        JOptionPane.showMessageDialog(null,vocabulario);
    }
    public String getVocabulario() {
        return vocabulario;
    }
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
}
