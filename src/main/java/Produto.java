public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //setter and getter for preco
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
