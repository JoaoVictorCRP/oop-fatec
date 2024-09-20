package br.edu.fatecfranca.lista4.ex5.classes;

public class ContaEspecial extends Conta {
    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String nomeCliente, double salario, double saldo, double limite,int numeroConta) {
        super(nomeCliente, salario, saldo, limite, numeroConta);
    }

    @Override
    public void setLimite(double limite) {
        if (limite <= this.salario*3){ // Limite pode ser até 3x o salário
            this.limite = limite;
            return;
        }
        System.out.println("O limite não pode ser maior que o valor do salário.");
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", salario=" + salario +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", numeroConta=" + numeroConta +
                '}';
    }
}
