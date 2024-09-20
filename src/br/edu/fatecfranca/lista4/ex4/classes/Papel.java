package br.edu.fatecfranca.lista4.ex4.classes;

public class Papel extends Coisa{
    public Papel(){}


    @Override
    public void duelar(Coisa rival) {
        if(rival instanceof Papel){
            System.out.println("Dois papéis.\nEmpate!");
        } else if (rival instanceof Tesoura) {
            System.out.println("Papel é cortado por tesoura.\nVocê perdeu!");
        } else {
            System.out.println("Papel envolve pedra.\nVocê venceu!");
        }
    }
}
