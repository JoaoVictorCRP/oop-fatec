package br.edu.fatecfranca.lista1.ex1;

import javax.swing.*;

public class TestaAluno {
    public static void main(String[] args) {
        int numeroAluno = 1;
        String nome="João Victor";
        int idade=20;
        Aluno aluno = new Aluno(numeroAluno, nome, idade);
        aluno.p1 = 8.9;
        aluno.p2 = 10;
        JOptionPane.showMessageDialog(null, aluno);
        JOptionPane.showMessageDialog(null, "Nota final de " + aluno.nome + ": " + aluno.notaFinal());
        JOptionPane.showMessageDialog(null, "Passou? " + aluno.passou());
    }
}
