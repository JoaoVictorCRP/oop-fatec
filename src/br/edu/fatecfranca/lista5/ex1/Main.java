package br.edu.fatecfranca.lista5.ex1;

import br.edu.fatecfranca.lista5.ex1.classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(46,"Daniel", "12.234.456-7", "123.456.789-00");
        p1.respira();
        p1.come();
        p1.ensina();
        p1.getRG();
        p1.getCPF();
        p1.pagarIR();

    }
}
