package exercicio02;

public class Gerente extends Funcionario {

    // TODO: implemente o código desta classe

    private double bonusAnual;

    public Gerente(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {
        double res = 0;
        res = getSalarioMensal()*13 + (getSalarioMensal()*bonusAnual);
        return res;
    }
}
