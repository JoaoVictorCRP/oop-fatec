package br.edu.fatecfranca; // Para auto-organizar, basta digitar o nome do pacote, passar o mouse e clicar em
                            // "move package to {nome_do pacote}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno","Prata",2009, 0F);
        Carro carroTop = new Carro("Toyota","Corolla","Cinza",2013, 0F);

        // JOptionPane nos oferece uma interface gráfica para inserções.
        String x = JOptionPane.showInputDialog("Quanto você deseja acelerar?");
        meuCarro.acelerar(Float.parseFloat(x));
        meuCarro.frear(5);

        JOptionPane.showMessageDialog(null, meuCarro);
    }
}