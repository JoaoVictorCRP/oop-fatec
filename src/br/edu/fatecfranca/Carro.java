package br.edu.fatecfranca;

public class Carro {
    // Declaração das variáveis
    public String marca, modelo, cor;
    public int ano;

    // Construtor
    // Os parâmetros representam os valores passados pelo usuário, que serão atribuídos ao objeto.
    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println(this.modelo + " está acelerando!");
    }
    public void frear(){
        System.out.println(this.modelo + " freou...");
    }

    public String ToString() {
        return this.marca + "\n" + this.modelo + "\n" + this.cor + "\n" + this.ano + "\n";
    }
}
