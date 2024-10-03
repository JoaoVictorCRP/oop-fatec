package br.edu.fatecfranca.lista5.ex3.classes;

import br.edu.fatecfranca.lista5.ex3.interfaces.Humano;
import br.edu.fatecfranca.lista5.ex3.interfaces.Vilao;

public class SuperVilao implements Vilao, Humano {
    public String nome;

    public SuperVilao(String nome) {
        this.nome = nome;
    }

    public SuperVilao() {
    };

    @Override
    public void ameacarInocentes() {
        System.out.println(this.nome + " está ameaçandos os cidadãos!");
    }

    @Override
    public void roubarBanco() {
        System.out.println(this.nome + " acaba de assaltar o banco municipal, ele está fugindo...");
    }

    @Override
    public void lutar() {
        System.out.println("Lutando...");
    }

    @Override
    public void morrer() {
        System.out.println(this.nome + " morreu.");
    }

    @Override
    public void correr() {
        System.out.println(this.nome + " está correndo...");
    }

}


