package br.edu.fatecfranca.lista2.ex2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public Aluno(){
        this.setNumeroAluno(0);
        this.setNome("");
        this.setIdade(0);
        this.setP1(0);
        this.setP2(0);
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        if(String.valueOf(numeroAluno).length()==6){
            this.numeroAluno = numeroAluno;
            return;
        };
        System.out.println("ERRO: Número do aluno deve ter tamanho exatamente igual a 6.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length()<=30){
            this.nome = nome;
            return;
        }
        System.out.println("ERRO: Nome do Aluno não pode ultrapassar 30 caracteres.");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1>=0){
            this.p1 = p1;
            return;
        }
        System.out.println("Nota 1 não pode ser negativa!");
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2>=0){
            this.p2 = p2;
            return;
        }
        System.out.println("Nota 2 não pode ser negativa!");
    }

    public void notaFinal(){
        float media = (this.p1+this.p2)/2;
        System.out.println("Nota Final de "+ this.getNome() + ": "+ media);
    }

    public void dadosAluno() {
        System.out.println(
            "Número do Aluno: " + numeroAluno +
            "\nNome: " + nome +
            "\nIdade: " + idade
        );
    }
}
