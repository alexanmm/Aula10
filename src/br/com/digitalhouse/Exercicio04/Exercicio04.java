package br.com.digitalhouse.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {

    //Exercício 4:
    //1. Criar uma classe Funcionário que tenha como atributos nome (String) e
    //numeroDeRegistro (Integer).
    //2. Criar um construtor para a classe Funcionário que receba como parâmetro
    //o nome e o número de registro.
    //3. Criar na classe Main uma lista de funcionários e adicionar quatro
    //funcionários novos.
    //4. Criar um funcionário novo com um número de registro contido na lista e
    //perguntar se ele está na lista (utilizar o método contains)
    //5. Sobrescrever o equals da classe Funcionário para que compare apenas o
    //número de registro.
    // 6. Perguntar novamente se o funcionário novo está na lista. Qual é o
    //resultado? O que mudou? Por quê?

    public static void main(String[] args) {

        Funcionario carlos = new Funcionario("Carlos", 6000);
        Funcionario junior = new Funcionario("Júnior", 6010);
        Funcionario joao = new Funcionario("João", 60021);
        Funcionario pedro = new Funcionario("Pedro", 60200);
        Funcionario luis = new Funcionario("Luis", 60021);

        List<Funcionario> listaFuncionario = new ArrayList<>();

        listaFuncionario.add(carlos);
        listaFuncionario.add(junior);
        listaFuncionario.add(joao);
        listaFuncionario.add(pedro);
        listaFuncionario.add(luis);

        System.out.println(listaFuncionario.contains(luis));

    }

}
