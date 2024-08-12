package br.edu.fatecfranca; // Para auto-organizar, basta digitar o nome do pacote, passar o mouse e clicar em
                            // "move package to {nome_do pacote}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno","Prata",2009);
        Carro carroTop = new Carro("Toyota","Corolla","Cinza",2013);

        meuCarro.acelerar();
        meuCarro.frear();

        carroTop.acelerar();
    }
}