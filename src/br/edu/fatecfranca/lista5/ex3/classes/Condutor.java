package br.edu.fatecfranca.lista5.ex3.classes;

public class Condutor {
    public String name;
    public int age;

    public Condutor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Condutor(){}

    public void conduzir(){
        System.out.println("Eu sou o " + this.name + " e estou dirigindo.");
    }
}
