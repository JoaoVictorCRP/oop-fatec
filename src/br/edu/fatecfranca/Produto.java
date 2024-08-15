package br.edu.fatecfranca;

public class Produto {
    int id;
    String descricao;
    int qtde;
    float preco;

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    public Produto() {

    }

    public void vender(int x) {
        this.qtde = this.qtde-x;
    }

    public void comprar(int x) {
        this.qtde = this.qtde+x;
    }

    public void subir(float x) {
        this.preco = this.preco+x;
    }

    public void descer(float x) {
        this.preco = this.preco-x;
    }

    public void mostra() {
        System.out.print(
                "\nID: " + this.id +
                "\nDescrição: " + this.descricao +
                "\nQuantidade: " + this.qtde +
                "\nPreço: R$" + this.preco
        );
    }
}
