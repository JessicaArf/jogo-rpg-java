public class Mago extends Jogador{
    private static String nomeClasse = "Mago";
    public Mago() {
        super(100, 15,15);
    }
    public Mago(String nome) {
        super(100, 20,8, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}
