package br.edu.fatecfranca.lista2.ex1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
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
        if (numeroConta.length()==8){
            if (numeroConta.charAt(6)=='-'){
                this.numeroConta=numeroConta;
                return;
            }
            else System.out.println("Número da conta deve possuir o dígito verificador.");
            return;
        }
        System.out.println("Número da Conta é inválido!");
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length()==6){
            if (numeroAgencia.charAt(4)=='-'){
                this.numeroAgencia=numeroAgencia;
                return;
            } else System.out.println("Número da agência deve possuir o dígito verificador.");
            return;
        }
        System.out.println("Número da Agência é inválido!");
    }

    public void setNome(String nome) {
        if (nome.length()<=30){
            this.nome = nome;
            return;
        }
        System.out.println("Nome não deve ultrapassar 30 caracteres.");
    }

    public void setSaldo(float saldo) {
        if (saldo>=0){
            this.saldo=saldo;
            return;
        }
        System.out.println("Saldo não pode ser negativo.");
    }

    public void realizarDeposito(int valor){
        setSaldo(this.getSaldo()+valor);
    }

    public void realizarSaque(int valor){
        setSaldo(this.getSaldo()-valor);
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
