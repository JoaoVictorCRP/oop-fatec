package br.edu.fatecfranca.lista3.ex2;

import br.edu.fatecfranca.lista3.ex2.classes.Aluno;
import br.edu.fatecfranca.lista3.ex2.classes.Curso;
import br.edu.fatecfranca.lista3.ex2.classes.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "João Victor", "JoaoVictorXL120");
        Aluno a2 = new Aluno(2, "Yasmin", "Yayasilva");
        Aluno a3 = new Aluno(3, "Leonardo", "Leozinho20");
        Professor prof = new Professor(10, "Carlão", "CALucas");

        Curso curso1 = new Curso(100,"ADS", "Exatas");
        curso1.addDisciplina(1000,"Engenharia de Software","ES01", prof);

        curso1.addAlunoDisciplina(1000, a1);
        curso1.addAlunoDisciplina(1000, a2);
        curso1.addAlunoDisciplina(1000, a3);

        System.out.println(curso1.toString());
    }
}
