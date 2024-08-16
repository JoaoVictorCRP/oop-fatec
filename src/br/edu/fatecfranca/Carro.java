package br.edu.fatecfranca;

public class Carro {
    // Declaração das variáveis
    public String marca, modelo, cor;
    public int ano;
    public float velAtual;

    // Construtor
    // Os parâmetros representam os valores passados pelo usuário, que serão atribuídos ao objeto.
    public Carro(String marca, String modelo, String cor, int ano, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velAtual = velAtual;
    }

    public void acelerar(float x){
        this.velAtual += x;
    }
    public void frear(float x){
        if (this.velAtual-x >= 0) {
            this.velAtual -= x;
            return;
        }
        System.out.println(this.modelo + " não pode frear negativamente.");
    }

    public String ToString() {
        return this.marca + "\n" + this.modelo + "\n" + this.cor + "\n" + this.ano + "\n";
    }
}
