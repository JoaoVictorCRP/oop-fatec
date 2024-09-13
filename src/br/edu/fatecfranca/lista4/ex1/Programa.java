package br.edu.fatecfranca.lista4.ex1;


public class Programa {
    public static void main(String[] args) {
        Palco palco = new Palco();
        palco.atuar(); // Ação do ator, inicialmente feliz
        palco.plotTwist(); // Faz ator ficar triste
        palco.atuar(); // Ação do ator, que está triste após o plotTwist
    }
}

