import java.util.LinkedList;

public class Categoria {
    public static final int UNIDADE = 0;
    public static final int KILO = 1;
    public static final int LITRO = 2;

    private String nome;
    private int unit;
    private LinkedList<Produto> produtos;

    public String getNome() {
        return nome;
    }
    public int getUnit() {
        return unit;
    }
    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }
    public void setProdutos(LinkedList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Categoria(String nome, int unit) {
        this.nome = nome;
        this.unit = unit;
    }

    public void addProduto(Produto produto){
        for(Produto p : produtos){
            if(p.getNome() == produto.getNome()){
                throw new IllegalArgumentException("Produto não pode ter o mesmo nome que um já existente");
            }
        }
        produtos.add(produto);
    }
}
