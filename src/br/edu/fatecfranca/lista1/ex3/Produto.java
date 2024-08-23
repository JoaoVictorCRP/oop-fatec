package br.edu.fatecfranca.lista1.ex3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    public Produto() {

    }

    public void vender(int x) {
        if(this.qtde<=0){
            System.out.println("Estoque não pode ser negativo.");
            return;
        }
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

    @Override
    public String toString() {
        return
                "\nID: " + this.id +
                "\nDescrição: " + this.descricao +
                "\nQuantidade: " + this.qtde +
                "\nPreço: R$" + this.preco;
    }
}
