package br.edu.fatecfranca.lista4.ex1;

public class Palco {
    private Ator ator = new AtorFeliz();

    public void plotTwist() {
        if(ator instanceof AtorFeliz){ // Se o ator tá feliz, o plotTwist deixa ele triste
            ator = new AtorTriste();
        } else {
            ator = new AtorFeliz(); // Se o ator tá triste, o plot deixa ele feliz.
        }

    }
    public void atuar() {
        ator.ato();
    }
}
