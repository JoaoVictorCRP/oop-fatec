package br.edu.fatecfranca.lista4.ex5;

import br.edu.fatecfranca.lista4.ex5.classes.Cartao;
import br.edu.fatecfranca.lista4.ex5.classes.Conta;
import br.edu.fatecfranca.lista4.ex5.classes.ContaEspecial;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("João", 1000, 500, 800,123);
        ContaEspecial contaEspecial = new ContaEspecial("Daniel", 5000, 6000, 800, 321);

        Cartao cartao1 = new Cartao(conta, "12345");
        Cartao cartao2 = new Cartao(contaEspecial, "54321");

        cartao1.retirada(200, "12345");
        cartao2.setSenha("54321", "0000");

        System.out.println(cartao1);
        System.out.println(cartao2);
    }
}
