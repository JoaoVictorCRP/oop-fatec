package br.edu.fatecfranca.lista5.classes;

import br.edu.fatecfranca.lista5.interfaces.JogadorBasquete;

public class AtletaBasquete implements JogadorBasquete {
    public String nome;
    public String time;

    public AtletaBasquete(String nome, String time) {
        this.nome = nome;
        this.time = time;
    }

    public AtletaBasquete() {}

    public void arremessar(){
        System.out.println(this.nome + " acaba de arremessar.");
    }

    @Override
    public void darToco() {
        System.out.println(this.nome + " acaba de dar toco.");
    }

    @Override
    public String toString() {
        return "AtletaBasquete{" +
                "nome='" + nome + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
