public class Categoria {
    public static final int UNIDADE = 0;
    public static final int KILO = 1;
    public static final int LITRO = 2;

    private String nome;
    private int unit;

    public String getNome() {
        return nome;
    }
    public int getUnit() {
        return unit;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Categoria(String nome, int unit) {
        this.nome = nome;
        this.unit = unit;
    }
}
