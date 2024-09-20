package br.edu.fatecfranca.lista4.ex5.classes;

public class Conta {
    protected String nomeCliente;
    protected double salario, saldo, limite;
    protected int numeroConta;

    public Conta(String nomeCliente, double salario, double saldo, double limite, int numeroConta) {
        this.nomeCliente = nomeCliente;
        this.salario = salario;
        this.setSaldo(saldo);
        this.limite = limite;
        this.numeroConta = numeroConta;
    }

    public Conta(){}

    public boolean retira(int valor){
        if(valor<=saldo && valor>=0){
            saldo -= valor;
            return true;
        } else return false;
    }

    public void deposito(int valor){
        saldo += valor;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSaldo() {
        return saldo;
    }

    public double saldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite <= this.salario){
            this.limite = limite;
            return;
        }
        System.out.println("O limite não pode ser maior que o valor do salário.");
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", salario=" + salario +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", numeroConta=" + numeroConta +
                '}';
    }
}
