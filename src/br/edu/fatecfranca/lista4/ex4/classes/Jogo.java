package br.edu.fatecfranca.lista4.ex4.classes;

import java.util.HashMap;
import java.util.Map;

public class Jogo {
    public Jogo(){}

    public void jogar(Coisa c1) {
        // Opções para o computador
        Map<Integer, Coisa> coisas = new HashMap<Integer, Coisa>();
        coisas.put(1, new Pedra());
        coisas.put(2, new Papel());
        coisas.put(3, new Tesoura());

        int range = 3 - 1 + 1; // max - min + 1 (Range para número aleatório)
        int rand = (int)(Math.random() * range) + 1; // (random() * range) + min.

        Coisa escolhaComputador = coisas.get(rand);

        c1.duelar(escolhaComputador);
    }
}
