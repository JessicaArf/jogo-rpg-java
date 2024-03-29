public class Mago extends Jogador{
    private static String nomeClasse = "Mago";
    public Mago() {
        super(200, 20,8);
    }
    public Mago(String nome) {
        super(200, 20,8, nome);
    }

    public static String getNomeClasse() {
        return nomeClasse;
    }

}
