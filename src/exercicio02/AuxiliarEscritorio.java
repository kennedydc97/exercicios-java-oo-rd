package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    // TODO: implemente o código desta classe
    private double bonusAnual;

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }


    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {
        double res = 0;
        res = this.getSalarioMensal() * 13 + getBonusAnual();
        return res;
    }
}
