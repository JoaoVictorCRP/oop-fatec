package br.edu.fatecfranca.lista5.ex3;

import br.edu.fatecfranca.lista5.ex3.classes.SuperHeroi;
import br.edu.fatecfranca.lista5.ex3.classes.SuperVilao;

public class Main {
    public static void main(String[] args) {
        SuperHeroi batman = new SuperHeroi("Bruce Wayne", "Batman");
        SuperVilao coringa = new SuperVilao("Coringa");

        coringa.ameacarInocentes();
        coringa.roubarBanco();
        coringa.correr();

        batman.transformar();
        batman.correr();

        batman.lutar();
        coringa.lutar();
        batman.derrotarVilao(coringa); // POLIMORFISMO: coringa será lido como Humano
        batman.salvarODia();
    }
}
