package br.edu.fatecfranca.lista4.ex3;

import br.edu.fatecfranca.lista4.ex3.classes.Controle;
import br.edu.fatecfranca.lista4.ex3.classes.Produto;
import br.edu.fatecfranca.lista4.ex3.classes.Radio;
import br.edu.fatecfranca.lista4.ex3.classes.TV;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();

        Produto p = new Produto(10,150);
        controle.testaProduto(p);
        System.out.println(p + "\n");

        Radio radio = new Radio(20, 100, 91.1, "The Beatles");
        controle.testaProduto(radio); // POLIFORMISMO AQUI
        System.out.println(radio.escutar());
        System.out.println(radio + "\n");

        TV tv = new TV(20, 100, "SBT");
        controle.testaProduto(tv); // POLIFORMISMO AQUI
        System.out.println(tv.assistir());
        System.out.println(tv);


    }
}
