public class Guerreiro extends Jogador {
    private static String nomeClasse = "Guerreiro";
    public Guerreiro() {
        super(80, 10, 15);
    }

    public Guerreiro(String nome) {
        super(80, 10, 15, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}

