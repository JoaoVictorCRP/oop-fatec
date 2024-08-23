package br.edu.fatecfranca.lista2;

import br.edu.fatecfranca.lista2.ex0.Compra;

public class Main {
    public static void main(String[] args) {
        Compra objCompra = new Compra(200, 2, "Aprovada");

        Compra objCompra2 = new Compra();
        objCompra2.setQtde(-10);
        objCompra2.setValor(-200);
        objCompra2.setSituacao("");

        Compra objCompra3 = new Compra();
        objCompra3.setQtde(10);
        objCompra3.setValor(200);
        objCompra3.setSituacao("Aprovada");

        System.out.println(objCompra);
        System.out.println(objCompra2);
        System.out.println(objCompra3);

        System.out.println("Qtde de obj1: " + objCompra.getQtde());
    }
}
