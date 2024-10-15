package atividade02.produto;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void aplicarDesconto(double desconto) {
        desconto = this.precoProduto * (desconto/100);
        this.precoProduto -= desconto;
    }

}
