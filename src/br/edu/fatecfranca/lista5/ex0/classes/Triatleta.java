package br.edu.fatecfranca.lista5.ex0.classes;

import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorBasquete;
import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorFutebol;
import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorVolei;

public class Triatleta implements JogadorFutebol, JogadorBasquete, JogadorVolei {
    String name;

    public Triatleta() {}

    public Triatleta(String name) {
        this.name = name;
    }

    @Override
    public void baterPenalti() {
        System.out.println(this.name + " bateu o pênalti! Golaço.");
    }

    @Override
    public void cobrarEscanteio() {
        System.out.println(this.name + " acaba de cobrar um escanteio.");
    }

    public void sacar(){
        System.out.println(this.name + " Acabou de sacar. ");
    }

    public void manchete(){
        System.out.println(this.name + " fez uma manchete.");
    }

    public void arremessar(){
        System.out.println(this.name + " acaba de arremessar.");
    }

    @Override
    public void darToco() {
        System.out.println(this.name + " acaba de dar toco.");
    }
}
