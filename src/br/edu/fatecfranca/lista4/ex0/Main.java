package br.edu.fatecfranca.lista4.ex0;

import java.util.ArrayList;

public class Main {
    public static void calculaFolhaSalarial(ArrayList<Funcionario> funcionarios){
        float soma=0;
        for (Funcionario funcionario : funcionarios) { // dois pontos equivale a um "em", ou seja para cada funcionario EM funcionarios
            soma += funcionario.getSalario();
        }
        System.out.println("Valor da folha salarial: " + soma);
    }

    public static void main(String[] args) {
        Assistente assis1 = new Assistente("João Victor", "Rua Irenio Greco","123.456.789-00", 1000, 5);
        System.out.println("\nAssistente: " + assis1);

        Gerente gerente1 = new Gerente("Daniel","Rua Noel Rosa","988.776.554-23",2500, 8);
        System.out.println("\n Gerente:"+gerente1);

        Diretor diretor = new Diretor("Heitor", "Rua Carlos Magalhães","098.765.432-10", 1800.0F, 400.0F);
        System.out.println("\nDiretor:"+diretor);

        // Array utilizando polimorfismo
        ArrayList<Funcionario> funcionarios = new ArrayList<>(); // aplicação do Polimorfismo => Um array de obejtos do tipo funcionario, que também permite objetos das classes filhas
        funcionarios.add(diretor);
        funcionarios.add(gerente1);
        funcionarios.add(diretor);
        calculaFolhaSalarial(funcionarios);
    }
}
