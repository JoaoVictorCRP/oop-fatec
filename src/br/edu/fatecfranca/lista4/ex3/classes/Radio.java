package br.edu.fatecfranca.lista4.ex3.classes;

import java.util.ArrayList;
import java.util.List;

public class Radio extends Produto{
    double estacao;
    String banda;

    public Radio(){
        super();
    }
    public Radio(int serialNumber, int volume, double estacao, String banda){
        super(serialNumber, volume);
        this.estacao = estacao;
        this.banda = banda;
    }

    public String escutar(){
        return "Você está na estação " + this.estacao + " FM, fique agora com " + this.banda;
    }

    public void trocaEstacao(double estacao){
        this.estacao = estacao;
    }

    public void trocaBanda(String banda){
        this.banda = banda;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nEstação=" + this.estacao +
        "\nBanda=" + this.banda;
    }
}
