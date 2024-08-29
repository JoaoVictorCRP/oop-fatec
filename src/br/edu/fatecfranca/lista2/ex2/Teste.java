package br.edu.fatecfranca.lista2.ex2;

public class Teste {
    public static void main(String[] args) {
        Aluno joao = new Aluno(109048, "João", 20, 8.5F, 9.9F);

        joao.notaFinal();
        joao.dadosAluno();
        // joao.nome  este atributo é privado, portanto, inacessível.
    }
}
