package br.com.digitalhouse.Exercicio01;

public class Exercicio01 {

    //Exercício 1:
    //1. Criar a classe Pessoa que tenha como atributos nome (String) e RG
    //(Integer).
    //2. Definir um construtor para a classe Pessoa que receba como parâmetro o
    //nome e o RG.
    //3. Na classe Main, criar duas pessoas com o mesmo número de RG.
    //4. Usando equals, comparar se a primeira pessoa criada é igual à segunda.
    //Qual é o resultado?
    //5. Sobrescrever o equals da classe Pessoa para que compare apenas o
    //número de RG.
    //6. Refazer a comparação utilizando o equals. Qual é o resultado? O que
    //mudou? Por quê?

    public static void main(String[] args) {

        Pessoa carlos = new Pessoa("Carlos", 1);
        Pessoa pedro = new Pessoa("Pedro", 344);

        System.out.println(carlos.equals(pedro));

    }

}
