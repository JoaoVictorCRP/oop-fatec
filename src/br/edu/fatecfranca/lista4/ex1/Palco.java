package br.edu.fatecfranca.lista4.ex1;

public class Palco {
    private Ator ator = new AtorFeliz();
    public void plotTwist() {
        ator = new AtorTriste();
    }
    public void atuar() {
        ator.ato();
    }
}
