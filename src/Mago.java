public class Mago extends Jogador{
    private static String nomeClasse = "Mago";
    public Mago() {
        super(80, 10,12);
    }
    public Mago(String nome) {
        super(80, 10,12, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}
