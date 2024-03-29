public class Guerreiro extends Jogador {
    private static String nomeClasse = "Guerreiro";
    public Guerreiro() {
        super(200, 15, 12);
    }

    public Guerreiro(String nome) {
        super(200, 15, 12, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}

