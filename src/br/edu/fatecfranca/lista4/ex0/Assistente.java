package br.edu.fatecfranca.lista4.ex0;

public class Assistente extends Funcionario {
    private int horaExtra;

    public Assistente(int horaExtra) {
        super(); // chama o construtor da superclasse (classe pai)
        this.horaExtra = 0;
    }

    public Assistente(String nome, String endereco, String cpf, float salario, int horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " HoraExtra: " + this.horaExtra;
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (horaExtra * 40);
    }
}
