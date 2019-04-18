package br.com.digitalhouse.Exercicio01;

import br.com.digitalhouse.Teste.Aluno;

public class Pessoa {

    //Atributos
    private String nome;
    private int rg;

    //Construtor
    public Pessoa() {
    }

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }


    //Métodos
    @Override
    public boolean equals(Object objetoPessoa) {

        if (!(objetoPessoa instanceof Pessoa)){
            return false;
        }

        return ((Pessoa) objetoPessoa).getRg() == this.getRg();

    }
}
