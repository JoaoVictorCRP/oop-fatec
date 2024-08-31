package br.edu.fatecfranca.lista3.ex0;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400);
        Product prod2 = new Product(2, "Bola de Futebol", 300);
        Product prod3 = new Product(3, "Bola de Volei", 200);

        ShoppingCart cart = new ShoppingCart(100, new Date(), "Franca", "Pix", 0);
        cart.addCarItem(prod1, 2, 10);
        cart.addCarItem(prod2, 5, 12);
        cart.calculateTotalPrice();
        System.out.println(cart);

    }
}
