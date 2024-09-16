package br.edu.fatecfranca.lista4.ex2;

import br.edu.fatecfranca.lista4.ex2.classes.Aniversario;
import br.edu.fatecfranca.lista4.ex2.classes.CartaoWeb;
import br.edu.fatecfranca.lista4.ex2.classes.DiaDosNamorados;
import br.edu.fatecfranca.lista4.ex2.classes.Natal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<>(); // O poliformismo será aplicado na inclusão das classes filhas em um array com tipagem da classe pai

        DiaDosNamorados cartaoNamorados = new DiaDosNamorados("João Victor");
        cartoes.add(cartaoNamorados);

        Natal natal = new Natal("João Victor");
        cartoes.add(natal);

        Aniversario niver = new Aniversario("João Victor");
        cartoes.add(niver);

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
