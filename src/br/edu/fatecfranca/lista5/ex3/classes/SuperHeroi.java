package br.edu.fatecfranca.lista5.ex3.classes;

import br.edu.fatecfranca.lista5.ex3.interfaces.Heroi;
import br.edu.fatecfranca.lista5.ex3.interfaces.Humano;


public class SuperHeroi implements Heroi, Humano {
    public String nome;
    public String alterEgo;

    public SuperHeroi(String nome, String alterEgo) {
        this.nome = nome;
        this.alterEgo = alterEgo;
    }

    public SuperHeroi() {};

    @Override
    public void lutar() {
        System.out.println("Lutando...");
    }

    @Override
    public void morrer() {
        System.out.println(this.alterEgo + " morreu.");
    }

    public void transformar(){
        System.out.println(nome + " acabou de virar o " + this.alterEgo);
    }

    @Override
    public void correr() {
        System.out.println(this.alterEgo + " está correndo...");
    }

    @Override
    public void derrotarVilao(Humano vilao) {
        vilao.morrer();
        System.out.println(this.alterEgo + " Acaba de derrotar o vilão!");
    }

    @Override
    public void salvarODia() {
        System.out.println(this.alterEgo + " Salva o dia!");
    }
}
