package br.edu.fatecfranca.lista3.ex0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private String destino;
    private String formaPagto;
    private float precoTotal;
    // Composição (Criação do objeto dentro da classe)
    private List<CarItem> carItens = new ArrayList<CarItem>();  // é preciso alocar espaço para o vetor

    public ShoppingCart() {}

    public ShoppingCart(int id, Date date, String destino, String formaPagto, float precoTotal) {
        this.id = id;
        this.date = date;
        this.destino = destino;
        this.formaPagto = formaPagto;
        this.precoTotal = precoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    // Adiciona um item no carrinho
    public void addCarItem(Product product, int quantity, int id) {
        this.carItens.add(new CarItem(id, quantity, product));
    }

    public void calculateTotalPrice(){
        float soma = 0;
        for (CarItem carItem : carItens) {
            soma += carItem.getProduct().getPrice() * carItem.getQuantity();
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", destino='" + destino + '\'' +
                ", formaPagto='" + formaPagto + '\'' +
                ", precoTotal=" + precoTotal +
                ", carItens=" + carItens +
                '}';
    }
}
