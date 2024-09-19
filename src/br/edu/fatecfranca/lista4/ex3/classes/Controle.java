package br.edu.fatecfranca.lista4.ex3.classes;

import java.util.SortedMap;

public class Controle{
    public Controle(){}

    public void testaProduto(Produto p){
        p.testaUnidade();
        System.out.println("Controle diz: O produto Nº" + p.getSerialNumber() + " Está " + p.descricao);
    }
}
