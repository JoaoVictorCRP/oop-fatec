package br.edu.fatecfranca.lista5.ex0;

import br.edu.fatecfranca.lista5.ex0.classes.Triatleta;
import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorBasquete;
import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorFutebol;
import br.edu.fatecfranca.lista5.ex0.interfaces.JogadorVolei;

public class Main {
    public static void main(String[] args) {
        JogadorFutebol futebolista;

        // Triatleta executando todos os métodos das interfaces
        Triatleta triatleta = new Triatleta("João da Silva");
        triatleta.manchete();
        triatleta.cobrarEscanteio();
        triatleta.darToco();

        // Quando a sobrescrição ocorrer em cima de uma variável tipada com a interface, como é o caso do futebolista,
        // a classe só poderá executar os métodos da interface que foi tipada, e mais nenhuma outra.
        futebolista = new Triatleta("Zé");
        futebolista.baterPenalti();
        futebolista.cobrarEscanteio();
        // futebolista.manchete(); <== Isso aqui não vai dar certo!

    }
}
