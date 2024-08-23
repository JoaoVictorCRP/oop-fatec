package br.edu.fatecfranca.lista1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public double p1, p2;
    boolean aprovado=false;

    public Aluno(int numeroAluno, String nome, int idade){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
    }

    public double notaFinal(){
        double mediaFinal = (this.p1 + this.p2) / 2;
        this.aprovado = mediaFinal > 6;
        return mediaFinal;
    }

    @Override
    public String toString(){
        return "Nº do Aluno: " + this.numeroAluno + "\nNome do Aluno: " + this.nome + "\nIdade do Aluno: " + this.idade;
    }

    public boolean passou(){
        return this.aprovado;
    }
}
