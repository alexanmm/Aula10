package br.com.digitalhouse.Teste;

public class Aluno {

    //Atributos
    private int ra;
    private String nome;
    private String sobrenome;
    private int idade;
    private Curso curso;

    //Construtor
    public Aluno() {
    }

    public Aluno(int ra, String nome, String sobrenome, int idade, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.curso = curso;
    }

    //Getter and Setter
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    //Métodos
    @Override
    public boolean equals(Object outroAluno) {

        if (!(outroAluno instanceof Aluno)){
            return false;
        }

        if (    ((Aluno) outroAluno).getRa() == this.getRa()
             && ((Aluno) outroAluno).getNome().equals(this.getNome())){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        return ra + nome.hashCode();

    }

    @Override
    public String toString() {

        return "RA: " + ra +
                "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nNome do Curso: " + curso.getNome();

    }

}
