package br.com.digitalhouse.Teste;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Curso cursoFullStack = new Curso("Web FullStack");
        Curso cursoAndroid  = new Curso("Mobile Android");

        Aluno vini = new Aluno(123, "Vinicius", "Oliveirar", 30, cursoAndroid);
        Aluno vinicius = new Aluno(123, "Vinicius", "Oliveirar", 30, cursoAndroid);
        Aluno jessica = new Aluno(321, "Jessica", "Milena", 45, cursoFullStack);
        Aluno hendy = new Aluno(456, "Hendy", "Almeida", 24, cursoFullStack);
        Aluno ana = new Aluno(654, "Ana", "Pereira", 33, cursoAndroid);

        /* Lista de Alunos */
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(vini);
        alunos.add(jessica);
        alunos.add(hendy);
        alunos.add(ana);

        //Equals
        System.out.println(vini.equals(vinicius));
        System.out.println(vini.equals(jessica));

        //Contains
        System.out.println(
                alunos.contains(vinicius)
        );

        //Hashcode
        System.out.println(vini.hashCode());
        System.out.println(vinicius.hashCode());
        System.out.println(jessica.hashCode());

        //toString
        System.out.println(vini.toString());
        System.out.println(jessica.toString());


    }

}
