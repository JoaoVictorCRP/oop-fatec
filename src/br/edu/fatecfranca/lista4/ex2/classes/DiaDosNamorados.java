package br.edu.fatecfranca.lista4.ex2.classes;

public class DiaDosNamorados extends CartaoWeb{
    private String destinatario;

    public DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }

    public DiaDosNamorados(){}

    public void showMessage(){
        System.out.println("Oi, " + this.destinatario + "! Feliz dia dos namorados. <3");
    };

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
