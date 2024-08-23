package br.edu.fatecfranca.lista1.ex4;

public class Rio {
    public String nome;
    public float nivel;
    private boolean poluido=false;

    public Rio(String nome, float nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public Rio(){};

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        this.nivel -= x;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public String toString(){
        return "\nNome do Rio: " + this.nome +
        "\nNivel: " + this.nivel + "\nPoluído: " + this.poluido;
    }
}
