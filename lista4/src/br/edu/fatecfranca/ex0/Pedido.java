/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex0;

import java.util.Date;

/**
 *
 * @author jaque
 */
public class Pedido {
    private int codigo;
    private Date data;
    private float valorTotal;
    
    //associação
    private ItemPedido itemPedido;

    public Pedido() {
    }

    public Pedido(int codigo, Date data, float valorTotal, int cPedido, float vPedido, int qPedido) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotal = valorTotal;
        //composição
        this.itemPedido = new ItemPedido(cPedido,qPedido,vPedido);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(int cPedido, float vPedido, int qPedido) {
        this.itemPedido = new ItemPedido(cPedido,qPedido,vPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + ", valorTotal=" + valorTotal + ", itemPedido=" + itemPedido.toString() + '}';
    }
}
