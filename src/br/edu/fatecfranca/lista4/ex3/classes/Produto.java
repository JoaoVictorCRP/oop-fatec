package br.edu.fatecfranca.lista4.ex3.classes;


public class Produto {
    private int serialNumber;
    private int volume;
    protected String descricao="Não testado";

    public Produto(int serialNumber, int volume) {
        this.serialNumber = serialNumber;
        this.volume = volume;
    }

    public Produto(){
    }

    protected boolean testaUnidade(){
        int range = 100 - 1 + 1; // max - min + 1 (Range para número aleatório)
        int rand = (int)(Math.random() * range) + 1; // (random() * range) + min.

        if(rand<=90){ // 90% de chance de estar ok
            descricao="Aprovado";
            return true;
        } else {
            descricao = "Reprovado";
            return false;
        }
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber=" + serialNumber +
                ", volume=" + volume +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
