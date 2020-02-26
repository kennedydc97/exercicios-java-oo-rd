package exercicio02;

public class TecnicoManutencao extends Funcionario {

    // TODO: implemente o código desta classe
    private double bonusAnual;
    private double insalubridade;

    public TecnicoManutencao(String nome, double salarioMensal, double bonusAnual, double insalubridade) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
        this.insalubridade = insalubridade;
    }

    @Override
    public double salarioAnual() {
        double res = 0;
        res = getSalarioMensal() * 13 + bonusAnual + (getSalarioMensal()*insalubridade * 13);
        return res;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}
