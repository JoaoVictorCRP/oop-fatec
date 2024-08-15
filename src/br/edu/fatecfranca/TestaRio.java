package br.edu.fatecfranca;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio1 = new Rio("de Piracicaba", 90.2F); // O rio de piracicaba vai jogar água pra fora?

        Rio rio2 = new Rio();
        rio2.nome = "Nilo";
        rio2.nivel = 3.4F;

        rio1.chover(5.8F);
        rio2.chover(0.7F);

        rio1.ensolarar(90F);
        rio2.ensolarar(0.5F);

        rio1.limpar();
        rio2.limpar();

        rio1.sujar();
        rio2.sujar();

        rio1.mostra();
        rio2.mostra();
    }
}
