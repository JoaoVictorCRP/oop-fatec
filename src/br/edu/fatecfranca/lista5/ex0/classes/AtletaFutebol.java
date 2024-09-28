package br.edu.fatecfranca.lista5.classes;

import br.edu.fatecfranca.lista5.interfaces.JogadorFutebol;

public class AtletaFutebol implements JogadorFutebol {
    public String name;
    public String time;

    public AtletaFutebol(String nome, String time) {
        this.name = name;
        this.time = time;
    }

    public AtletaFutebol(){}

    @Override
    public void baterPenalti() {
        System.out.println(this.name + " bateu o pênalti! É gol do " + this.time + ".");
    }

    @Override
    public void cobrarEscanteio() {
        System.out.println(this.name + " acaba de cobrar um escanteio.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
