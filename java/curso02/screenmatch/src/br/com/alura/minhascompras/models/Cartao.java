package br.com.alura.minhascompras.models;

import java.util.List;
import java.util.ArrayList;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(double limite) {
        this.limite = limite;
        saldo = limite;
        compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
