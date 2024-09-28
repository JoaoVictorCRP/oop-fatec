package br.edu.fatecfranca.lista5;

import br.edu.fatecfranca.lista5.classes.AtletaBasquete;
import br.edu.fatecfranca.lista5.classes.AtletaFutebol;
import br.edu.fatecfranca.lista5.classes.AtletaVolei;
import br.edu.fatecfranca.lista5.classes.Triatleta;

public class Main {
    public static void main(String[] args) {
        AtletaBasquete basketballPlayer = new AtletaBasquete("Lucas Dias", "SESI Franca");
        AtletaFutebol footballPlayer = new AtletaFutebol("Memphis Depay", "Corinthians");
        AtletaVolei volleyPlayer = new AtletaVolei("Fernanda Garay", "Seleção Brasileira");

        // Profissionais...
        basketballPlayer.arremessar();
        footballPlayer.baterPenalti();
        volleyPlayer.sacar();

        // Amador... (Polimorfismo aqui)
        Triatleta triatleta = new Triatleta("João da Silva");
        triatleta.manchete();
        triatleta.cobrarEscanteio();
        triatleta.darToco();

        // Cuidado com a sobrescrição
        volleyPlayer = new AtletaVolei("José");
    }
}
