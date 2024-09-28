package br.edu.fatecfranca.lista5.classes;

import br.edu.fatecfranca.lista5.interfaces.JogadorVolei;

public class AtletaVolei implements JogadorVolei {
    String name;
    String time;

    public AtletaVolei(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public AtletaVolei(){}

    public void sacar(){
        System.out.println(this.name + " Acabou de sacar.");
    }

    public void manchete(){
        System.out.println(this.name + " fez uma manchete.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
