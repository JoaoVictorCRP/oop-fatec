package br.edu.fatecfranca.lista4.ex4.classes;

public class Tesoura extends Coisa{
    public Tesoura() {};

    public void duelar(Coisa rival) {
        if(rival instanceof Papel){
            System.out.println("Tesoura corta papel.\nVocê venceu!");
        } else if (rival instanceof Tesoura) {
            System.out.println("Duas tesouras! \nEmpate!");
        } else {
            System.out.println("Tesoura é quebrada por pedra.\nVocê perdeu!");
        }
    };
}
