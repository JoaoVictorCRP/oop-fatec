package br.edu.fatecfranca.lista5.ex3;

import br.edu.fatecfranca.lista5.ex3.classes.Condutor;
import br.edu.fatecfranca.lista5.ex3.classes.CondutorAdapter;

public class Main {
    public static void main(String[] args) {
        Condutor condutorNormal1 = new Condutor("Cássio", 45);
        Condutor condutorNormal2 = new Condutor("João Victor", 20);

        CondutorAdapter condutorAdaptado1 = new CondutorAdapter(condutorNormal1);
        CondutorAdapter condutorAdaptado2 = new CondutorAdapter(condutorNormal2);

        condutorAdaptado1.dirigir();
        condutorAdaptado2.dirigir(); // Por baixo dos panos, ele na verdade está chamando o método conduzir da classe Condutor
        System.out.println();
    }
}
