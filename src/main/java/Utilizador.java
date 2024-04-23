public class Utilizador {
    private int passwordHash;
    private String username;

    public Utilizador(String nome, String password){
        username = nome;
        passwordHash = password.hashCode();
    }
}
