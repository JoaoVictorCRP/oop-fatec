package br.edu.fatecfranca.lista5.classes;

import br.edu.fatecfranca.lista5.interfaces.JogadorBasquete;

public class AtletaBasquete implements JogadorBasquete {
    public String name;
    public String time;

    public AtletaBasquete(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public AtletaBasquete() {}

    public void arremessar(){
        System.out.println(this.name + " acaba de arremessar.");
    }

    @Override
    public void darToco() {
        System.out.println(this.name + " acaba de dar toco.");
    }

    @Override
    public String toString() {
        return "AtletaBasquete{" +
                "nome='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
