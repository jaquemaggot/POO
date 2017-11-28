/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

/**
 *
 * @author jaque
 */
public class Reserva {
    private int codigo;
    private Voo voo;

    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
    }

    public Reserva() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo=" + codigo + ", voo=" + voo.toString() + '}';
    }
}
