package br.com.digitalhouse.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

    //Exercício 3:
    //1. Criar uma classe Aluno que tenha como atributos nome (String) e
    //numeroDeAluno (Integer).
    //2. Criar um construtor para a classe Aluno que receba como parâmetro o
    //nome e o número de aluno.
    //3. Na classe Main, criar uma lista de alunos e adicionar quatro alunos novos.
    //4. Criar um aluno novo com um número de aluno contido na lista e perguntar
    //se ele está na lista (utilizar o método contains).
    //5. Sobrescrever o equals da classe Aluno para que compare apenas o
    //número de aluno.
    //6. Perguntar novamente se o aluno novo está na lista. Qual é o resultado? O
    //que mudou? Por quê?

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno carlos = new Aluno("Carlos", 5);
        Aluno antonio = new Aluno("Antonio",40);
        Aluno joao = new Aluno("João", 60);
        Aluno tiago = new Aluno("Tiago", 10);
        Aluno vagner = new Aluno("Vagner", 5);

        listaAlunos.add(carlos);
        listaAlunos.add(antonio);
        listaAlunos.add(joao);
        listaAlunos.add(tiago);

        System.out.println(listaAlunos.contains(vagner));

    }

}
