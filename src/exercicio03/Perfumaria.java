package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java

public class Perfumaria extends Produto{
    private double precoPromocional;
    private double LMPM;

    public Perfumaria(int ID, String nome, double precoVenda, double desconto, double precoPromocional, double LMPM) {
        super(ID, nome, precoVenda, desconto);
        if(precoPromocional < precoVenda) {
            this.precoPromocional = precoPromocional;
            this.LMPM = LMPM;
        }else{
            System.out.println("Preço promocional inválido");
        }
    }

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public double getLMPM() {
        return LMPM;
    }

    public void setLMPM(double LMPM) {
        this.LMPM = LMPM;
    }
}