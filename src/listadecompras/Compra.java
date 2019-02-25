package listadecompras;

public class Compra {
    
    private String nome;
    private double preco;
    private double quantidade;
    private double precoTotal;

    
    
    
    public Compra(String nome, double preco, double quantidade, double precoTotal) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.precoTotal = 0;
    }
    public Compra() {
    }
    

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    
    
    
    
    
    
}
