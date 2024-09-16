package br.edu.fatecfranca.lista4.ex2.classes;

public class Natal extends CartaoWeb{
    private String destinatario;

    public Natal(String destinatario){
        this.destinatario = destinatario;
    }

    public Natal(){}

    public void showMessage(){
        System.out.println("Oi, " + this.destinatario + "! Um feliz natal para você e toda sua família. :)");
    };

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
