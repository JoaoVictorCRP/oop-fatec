package br.edu.fatecfranca;

public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo = 0.0F;

    public Cliente(int numeroConta, int numeroAgencia, String nome) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }

    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    public void realizarSaque(float valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
    }

    public String dadosCliente() {
        return "Nome: " + this.nome + "\nNº da Conta: " + this.numeroConta + "\nSaldo: " + this.saldo;
    }
}
