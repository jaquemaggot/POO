/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex0;

/**
 *
 * @author jaque
 */
public class ItemPedido {
    private int codigo, qtde;
    private float valor;

    public ItemPedido(int codigo, int qtde, float valor) {
        this.codigo = codigo;
        this.qtde = qtde;
        this.valor = valor;
    }
    public ItemPedido() {
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "ItemPedido{" + "codigo=" + codigo + ", qtde=" + qtde + ", valor=" + valor + '}';
    }
}
