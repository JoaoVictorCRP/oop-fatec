package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        int numeroAluno = 1;
        String nome="João Victor";
        int idade=20;
        Aluno aluno = new Aluno(numeroAluno, nome, idade);
        aluno.p1 = 8.9;
        aluno.p2 = 10;
        System.out.println(aluno.dadosAluno());
        System.out.println("Nota final de " + aluno.nome + ": " + aluno.notaFinal());
        System.out.println("Passou? " + aluno.passou());
    }
}
