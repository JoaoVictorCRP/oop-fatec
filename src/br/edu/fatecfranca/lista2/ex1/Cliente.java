package br.edu.fatecfranca.lista2.ex1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setNome(nome);
        setSaldo(saldo);
    }

    Cliente(){
        numeroConta = "";
        numeroAgencia = "";
        nome = "";
        saldo = 0;
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    // Setters
    public void setNumeroConta(String numeroConta) {
        if (numeroConta.length()==8 && numeroConta.charAt(numeroConta.length()-2)=='-'){
            this.numeroConta=numeroConta;
            return;
        }
        System.out.println("Número da Conta é inválido!");
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length()==6 && numeroAgencia.charAt(numeroAgencia.length()-2)=='-'){
            this.numeroAgencia=numeroAgencia;
            return;
        }
        System.out.println("Número da Agência é inválido!");
    }

    public void setNome(String nome) {
        if (nome.length()<30){
            this.nome = nome;
            return;
        }
        System.out.println("Nome deve possuir menos de 30 caracteres.");
    }

    public void setSaldo(float saldo) {
        if (saldo<0){
            return; // Saldo não pode ser negativo
        }
        this.saldo=saldo;
    }

    public void realizarDeposito(int valor){
        this.saldo+=valor;
    }

    public void realizarSaque(int valor){
        if ((this.saldo-valor)<0){
            System.out.println("Seu saldo é insuficiente!");
            return;
        }
        this.saldo-=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroConta='" + numeroConta + '\'' +
                ", numeroAgencia='" + numeroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
