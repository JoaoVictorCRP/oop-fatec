package br.edu.fatecfranca;

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

    public void mostra(){
        System.out.printf("\nNome do Rio: %s\nNivel: %.2f\nPoluido: %s", this.nome, this.nivel, this.poluido);
    }
}
