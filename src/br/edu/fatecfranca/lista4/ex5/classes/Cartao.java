package br.edu.fatecfranca.lista4.ex5.classes;

public class Cartao {
    private String senha;
    private Conta conta;

    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    public Cartao(){};

    public void retirada(int valor, String senha){
        if(this.senha.equals(senha)){
            this.conta.retira(valor);
        } else {
            System.out.println("Senha incorreta");
        }
    };

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = senhaAtual;
        } else {
            System.out.println("Senha incorreta");
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double saldo(){
        return this.conta.saldo();
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "senha='" + senha + '\'' +
                ", conta=" + conta +
                '}';
    }
}
