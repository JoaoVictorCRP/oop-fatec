package br.edu.fatecfranca.lista5.ex3.classes;

import br.edu.fatecfranca.lista5.ex3.interfaces.Motorista;

public class CondutorAdapter implements Motorista {
    public Condutor condutor;
    public CondutorAdapter(Condutor condutor) {
        this.condutor = condutor;
    };

    @Override
    public void dirigir() {
        this.condutor.conduzir(); // Adaptado... GENIAL.
    }
}
