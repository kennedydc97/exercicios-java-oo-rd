package exercicio03;

// TODO: implemente o código-fonte de Produto.java

public class Produto{
    private int ID;
    private String nome;
    private double precoVenda;
    private double desconto;

    public Produto(int ID, String nome, double precoVenda, double desconto) {
        if(precoVenda <= 0){
            System.out.println("preço de venda inválido");
        }
        else{
        this.ID = ID;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.desconto = desconto;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}