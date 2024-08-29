package br.edu.fatecfranca.lista2.ex1;

public class Teste {
    public static void main(String[] args) {
        Cliente fulano = new Cliente("123456-7", "1234-5","Fulano", 200);

        fulano.realizarDeposito(800);
        fulano.realizarSaque(500);

        // fulano.nome (Impossível acessar atributo privado)

        System.out.println(fulano);
    }
}
