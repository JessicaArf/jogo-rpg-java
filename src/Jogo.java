import java.util.Scanner;

public class Jogo {

    Scanner scanner = new Scanner(System.in);

    Inimigo inimigo = new Inimigo();
    Guerreiro guerreiro = new Guerreiro();
    Mago mago = new Mago();

    public void iniciarJogo() {
        System.out.println("--------------------------");
        System.out.println("Seja bem-vindo aventureiro!");
        System.out.println("---------------------------");
        System.out.println("Agora chegou o momento de escolher" +
                " a classe do seu personagem.\n" +
                "Digite o número correspodente com a classe para selecionar: \n"
                + "(1) Guerreiro \n" + "(2) Mago");
        guerreiro.mostrarAtributosPersonagem(guerreiro.getNomeClasse());
        mago.mostrarAtributosPersonagem(mago.getNomeClasse());
        int opcaoJogador = scanner.nextInt();

        switch (opcaoJogador) {
            case 1:
                batalhar(guerreiro, inimigo);
                break;
            case 2:
                batalhar(mago, inimigo);
                break;
            default:
                System.out.println("Selecione uma opção válida.");
        }
    }

    public void batalhar(Jogador jogador, Inimigo inimigo) {
        System.out.println(jogador.getVida());
        System.out.println(inimigo.getVida());
        System.out.println("--------------------------------------------");
        System.out.println("Agora escolha um nome para o seu personagem.");
        System.out.println("--------------------------------------------");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("--------------------------------------------");
        System.out.println("Jogador(a) " + nome + " prepare-se para a batalha!\n");

        while (jogador.statusVida() && inimigo.statusVida()) {
            jogador.atacar(inimigo);
            inimigo.atacar(jogador, inimigo);
        }
        if (jogador.statusVida()) {
            System.out.println("--------------------------------------------");
            System.out.println("Você venceu!");
        } else {
            System.out.println("--------------------------------------------");
            System.out.println("Você foi derrotado!");
        }
    }
}
