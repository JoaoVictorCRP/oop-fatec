package br.edu.fatecfranca.lista4.ex4;

import br.edu.fatecfranca.lista4.ex4.classes.Jogo;
import br.edu.fatecfranca.lista4.ex4.classes.Tesoura;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        // Eu escolho tesoura
        Tesoura tesoura = new Tesoura();

        // Jogando...
        jogo.jogar(tesoura);
    }
}
