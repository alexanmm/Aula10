package br.com.digitalhouse.Exercicio02;

import br.com.digitalhouse.Exercicio01.Pessoa;

public class Coca {

    private int tamanho;
    private double preco;

    public Coca() {
    }

    public Coca(int tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Coca)){
            return false;
        }

        return ((Coca) obj).getTamanho() == this.getTamanho();

    }
}
