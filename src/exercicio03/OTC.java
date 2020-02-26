package exercicio03;

// TODO: implemente o código-fonte de OTC.java

public class OTC extends Produto{
    private double precoPromocional;

    public OTC(int ID, String nome, double precoVenda, double desconto, double precoPromocional) {
        super(ID, nome, precoVenda, desconto);
        this.precoPromocional = precoPromocional;
    }

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}