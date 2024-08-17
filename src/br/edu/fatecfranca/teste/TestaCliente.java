package br.edu.fatecfranca.teste;
import br.edu.fatecfranca.Cliente;

import javax.swing.*;

public class TestaCliente {
    public static void main(String[] args) {
        String nome = "Fulano";
        int numeroConta = 1108;
        int numeroAgencia = 2004;
        Cliente cliente1 = new Cliente(numeroConta, numeroAgencia, nome);
        cliente1.realizarDeposito(200);
        cliente1.realizarSaque(100);
        JOptionPane.showMessageDialog(null, cliente1.toString());


        nome = "Beltrano";
        numeroConta = 3007;
        numeroAgencia = 1976;
        Cliente cliente2 = new Cliente(numeroConta, numeroAgencia, nome);
        cliente2.realizarDeposito(500);
        cliente2.realizarSaque(1000); // Só testando a lógica do método
        JOptionPane.showMessageDialog(null, cliente2.toString());
    }
}
