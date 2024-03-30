<h1 align="center"><strong>#Elastech</strong></h1>
Este repositório foi criado para realizar o projeto de POO do #Elastech, onde foi proposto resolvermos o exercício utilizando a linguagem Java para praticarmos POO. 

Crie um jogo de RPG simples em Java, onde o jogador interage com o sistema por
meio do console. Na classe principal JogoRPG, um objeto Jogo é criado e o método
iniciarJogo() é chamado para começar a execução do jogo. Dentro do método
iniciarJogo(), o jogador é solicitado a escolher entre duas classes de personagens:
Guerreiro ou Mago. Dependendo da escolha do jogador, uma instância adequada da
classe Jogador é criada (Guerreiro ou Mago).
Após a seleção da classe do jogador, uma batalha é iniciada contra um inimigo
representado pela classe Inimigo. Durante a batalha, o jogador e o inimigo alternam
ataques até que a vida de um deles chegue a zero. O jogo continua em um loop
enquanto ambos, jogador e inimigo, estão vivos. Após a batalha, uma mensagem é
exibida indicando se o jogador venceu ou foi derrotado, com base na vida restante
do jogador.
A lógica do jogo é baseada na orientação a objetos, onde cada entidade do jogo
(jogador, inimigo) é representada por uma classe com seus próprios atributos e
métodos. Isso permite uma fácil extensão do jogo com novas funcionalidades,
como adicionar mais classes de personagens, itens, habilidades especiais, entre
outros.

Detalhe das Classes (Não precisa necessariamente ser assim)
<ol>
<li> Classe JogoRPG:<br/>
   a. Método main(String[] args): É o ponto de entrada do programa. Cria uma
   instância da classe Jogo e inicia o jogo chamando o método
   iniciarJogo().</li><br/>
<li> Classe Jogo:<br/>
   a. Atributos jogador e inimigo: Representam o jogador e o inimigo no jogo.<br/>
   b. Método Jogo(): Construtor da classe que inicializa um jogador e um
   inimigo.<br/>
   c. Método iniciarJogo(): Controla o fluxo do jogo, permitindo que o jogador
   escolha sua classe e inicie uma batalha contra um inimigo.
</li><br/>

<li> Classe Jogador:<br/>
   a. Atributos vida e ataque: Representam a quantidade de vida e o poder
   de ataque do jogador.<br/>
   b. Método Jogador(): Construtor que inicializa os atributos do jogador.<br/>
   c. Método atacar(Inimigo inimigo): Permite que o jogador ataque o inimigo,
   reduzindo sua vida.<br/>
   d. Método estaVivo(): Verifica se o jogador está vivo com base em sua
   vida atual. </li><br/>

<li> Classes Guerreiro e Mago (subclasses de Jogador):<br/>
   a. Métodos Guerreiro() e Mago(): Construtores que inicializam os atributos
   específicos de cada classe de jogador.
</li>
<br/>
<li> Classe Inimigo:<br/>
   a. Atributos vida e ataque: Representam a quantidade de vida e o poder
   de ataque do inimigo.<br/>
   b. Método Inimigo(): Construtor que inicializa os atributos do inimigo.<br/>
   c. Método atacar(Jogador jogador): Permite que o inimigo ataque o jogador,<br/>
   reduzindo sua vida.<br/>
   d. Método estaVivo(): Verifica se o inimigo está vivo com base em sua vida
   atual.
   </li>
</ol>
