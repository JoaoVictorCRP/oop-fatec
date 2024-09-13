package br.edu.fatecfranca.lista4.ex0;

public class Main {
    public static void main(String[] args) {
        Assistente assis1 = new Assistente("João Victor", "Rua Irenio Greco","123.456.789-00", 1000, 5);
        System.out.println("\nAssistente: " + assis1);

        Gerente gerente1 = new Gerente("Daniel","Rua Noel Rosa","988.776.554-23",2500, 8);
        System.out.println("\n Gerente:"+gerente1);

        Diretor diretor = new Diretor("Heitor", "Rua Carlos Magalhães","098.765.432-10", 1800.0F, 400.0F);
        System.out.println("\nDiretor:"+diretor);
    }
}
