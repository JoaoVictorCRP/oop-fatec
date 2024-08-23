package br.edu.fatecfranca.lista1.ex0; // Para auto-organizar, basta digitar o nome do pacote, passar o mouse e clicar em
                            // "move package to {nome_do pacote}

import javax.swing.*;

public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno","Prata",2009, 0F);
        Carro carroTop = new Carro("Toyota","Corolla","Cinza",2013, 0F);

        // JOptionPane nos oferece uma interface gráfica para inserções.
        String x = JOptionPane.showInputDialog("Quanto você deseja acelerar?");
        meuCarro.acelerar(Float.parseFloat(x));

        x =JOptionPane.showInputDialog("Quanto você deseja desacelerar?");
        meuCarro.frear(Float.parseFloat(x));

        JOptionPane.showMessageDialog(null, meuCarro); // Parent Component settado como null indica que essa janela
                                                                        // Não possui pai, ou seja, ela não surge de nenhuma outra
    }                                                                   // Janela, surge por si só.
}