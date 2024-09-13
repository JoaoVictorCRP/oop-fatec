package br.edu.fatecfranca.lista4.ex0;

public class Diretor extends Funcionario {
    private float acoesEmpresa;

    public Diretor(String nome,String endereco,String cpf, float salario, float acoesEmpresa){
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public Diretor(){}

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAções da Empresa: " + acoesEmpresa;
    }

    @Override
    public float calculaSalario(){
        return this.salario * (this.acoesEmpresa * 2.50F)/12; // Estamos multiplicando acoes da empresa por 2,50 pq nessa
    }                                                           // nossa brincadeira as ações valem R$2,50
}
