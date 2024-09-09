package br.edu.fatecfranca.lista3.ex1;

import br.edu.fatecfranca.lista3.ex1.classes.Forum;
import br.edu.fatecfranca.lista3.ex1.classes.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Joao Victor", "JoaoVictorCRP");
        Person p2 = new Person(2, "Larissa", "Larissa120");

        Forum forum = new Forum(100, "Conversas", "www.conversas.com");

        forum.addMessages(1000, "Oi, Larissa. Tudo bem?", p1);
        forum.addMessages(1001, "Tudo ótimo. E você?", p2);

        System.out.println(forum);
    }
}
