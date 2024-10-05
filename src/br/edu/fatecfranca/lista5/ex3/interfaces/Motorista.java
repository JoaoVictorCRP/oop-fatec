package br.edu.fatecfranca.lista5.ex3.interfaces;

public interface Motorista {

    public void dirigir(); // Este método é imcompatível com a classe Condutor, que possui o método "conduzir".
    // Para adaptar, podemos utilizar uma classe adaptadora (CondutorAdapter).
}
