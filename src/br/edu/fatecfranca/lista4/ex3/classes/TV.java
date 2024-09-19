package br.edu.fatecfranca.lista4.ex3.classes;

public class TV extends Produto{
    String canal;

    public TV(int serialNumber, int volume, String canal) {
        super(serialNumber, volume);
        this.canal = canal;
    }

    public TV(){
        super();
    }

    public String assistir(){
        return  "Olá, você está assistando o canal " + canal;
    }

    public void trocaCanal(String canal){
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nCanal=" + this.canal;
    }
}
