package br.edu.fatecfranca; // Para auto-organizar, basta digitar o nome do pacote, passar o mouse e clicar em
                            // "move package to {nome_do pacote}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno","Prata",2009, 0F);
        Carro carroTop = new Carro("Toyota","Corolla","Cinza",2013, 0F);

        meuCarro.acelerar(60);
        meuCarro.frear(10);

        carroTop.acelerar(95);
        carroTop.frear(5);

        System.out.println(meuCarro);
    }
}