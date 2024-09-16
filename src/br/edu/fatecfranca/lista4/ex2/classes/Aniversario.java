package br.edu.fatecfranca.lista4.ex2.classes;

public class Aniversario extends CartaoWeb{
    private String destinatario;

    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }

    public Aniversario(){}

    public void showMessage(){
        System.out.println("Oi, " + this.destinatario + "! Feliz aniversário, muitos anos de vida, paz, saúde e felicidade sempre.");
    };

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
