package br.edu.fatecfranca.lista4.ex4.classes;

public class Pedra extends Coisa {

    public Pedra(){};

    @Override
    public void duelar(Coisa rival) {
        if(rival instanceof Papel){
            System.out.println("Pedra é envolvida por papel. \nVocê perdeu");
        } else if (rival instanceof Tesoura) {
            System.out.println("Pedra quebra tesoura. \nVocê venceu!");
        } else {
            System.out.println("Duas pedras. \nEmpate!");
        }
    }
}
