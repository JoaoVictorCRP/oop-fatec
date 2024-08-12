package br.edu.fatecfranca;

public class Aluno {
    int numeroAluno;
    String nome;
    int idade;
    double p1, p2;
    boolean aprovado=false;

    Aluno(int numeroAluno, String nome, int idade){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
    }

    public double notaFinal(){
        double mediaFinal = (this.p1 + this.p2) / 2;
        if (mediaFinal > 6){
            this.aprovado = true;
        }
        return mediaFinal;
    }

    public String dadosAluno(){
        return "Nº do Aluno: " + this.numeroAluno + "\nNome do Aluno: " + this.nome + "\nIdade do Aluno: " + this.idade;
    }

    public boolean passou(){
        return this.aprovado;
    }
}
