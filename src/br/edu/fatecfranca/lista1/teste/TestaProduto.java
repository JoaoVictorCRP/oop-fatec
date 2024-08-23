package br.edu.fatecfranca.lista1.teste;
import br.edu.fatecfranca.lista1.Produto;

import javax.swing.*;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1,"Notebook", 400, 2500);
        Produto p2 = new Produto();

        p2.id = 2;
        p2.descricao = "Smartphone";
        p2.qtde = 10;
        p2.preco = 1100;

        p1.vender(395);
        p2.vender(5);

        p1.comprar(5);
        p2.comprar(10);

        p1.subir(300);
        p2.descer(100);


        JOptionPane.showMessageDialog(null, p1);
        JOptionPane.showMessageDialog(null, p2);
    }
}
