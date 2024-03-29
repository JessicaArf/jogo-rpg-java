public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;
    private String nome;

    public Jogador(int vida, int ataque, int defesa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public Jogador(int vida, int ataque, int defesa, String nome) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nome = nome;
    }

    public Jogador(){

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atacar(Inimigo inimigo){
        int vidaInimigo = inimigo.getVida();
        int dano = ataque - inimigo.getDefesa();
        vidaInimigo -= dano;
        inimigo.setVida(vidaInimigo);
        System.out.println("----------------------------------------------------------");
        System.out.println("Você atacou o inimigo e tirou " + dano + " pontos de vida.");
    }

    public void atacar(Jogador jogador, Inimigo inimigo){
        int vidaJogador = getVida();
        int dano = inimigo.getAtaque() - getDefesa();
        vidaJogador -= dano;
        setVida(vidaJogador);
        System.out.println("----------------------------------------------------------");
        System.out.println("O inimigo te atacou e tirou " + dano + " pontos de vida.");
    }

    public void mostrarAtributosPersonagem(String nomeClasse){
        System.out.println("-------------------------");
        System.out.println("Classe: " + nomeClasse);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
    }

    public boolean statusVida(){
        return vida >= 0;
    }

}
