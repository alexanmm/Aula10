package br.com.digitalhouse.Exercicio02;

public class Exercicio02 {

    //Exercício 2:
    //1. Criar a classe Coca que tenha como atributos um tamanho (Integer) e
    //preço (Double).
    //2. Definir um construtor para a classe Coca que receba como parâmetro o
    //tamanho e o preço.
    //3. Na classe Main, criar duas Cocas com o mesmo tamanho.
    //4. Usando equals, comparar se a primeira Coca criada é igual à segunda.
    //Qual é o resultado?
    //5. Sobrescrever o equals da classe Coca para que compare apenas o
    //tamanho.
    //6. Refazer a comparação utilizando o equals. Qual é o resultado? O que
    //mudou? Por quê?

    public static void main(String[] args) {

        Coca coca4l = new Coca(4, 5.00d);
        Coca coca1l = new Coca(4, 3.00d);

        System.out.println(coca4l.equals(coca1l));


    }

}
