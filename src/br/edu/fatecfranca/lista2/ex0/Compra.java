package br.edu.fatecfranca.lista2.ex0;

public class Compra {
    private float valor= 0;
    private int qtde = 0;
    private String situacao = "Reprovada";

    public Compra(float valor, int qtde, String situacao) {
        this.setValor(valor);
        this.setQtde(qtde);
        this.setSituacao(situacao);
    }

    public Compra() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor > 0){
            this.valor = valor;
            return;
        }
        System.out.println("Valor inválido");
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        if (qtde > 0){
            this.qtde = qtde;
            return;
        }
        System.out.println("Valor inválido");
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        if (situacao.equals("Aprovada") ||
            situacao.equals("Reprovada") ||
            situacao.equals("Pendente")
        ) {
            this.situacao = situacao;
            return;
        }
        System.out.println("O campo 'Situação' não pode estar vazio.");
    }

    @Override
    public String toString() {
        return "Compra{" +
                "\n valor=" + this.valor +
                "\n qtde=" + this.qtde +
                "\n Situação=" + this.situacao +
                "\n}";
    }
}

