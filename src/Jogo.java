public class Jogo {

    public void Jogar(int inicia, Jogador jogadorSelecionado) {

        if (inicia == 1) {
            System.out.println("Iniciando...");
            System.out.println("Seu personagem: " + jogadorSelecionado.getNome());
        } else {
            System.out.println("Voce saiu do jogo");
        }
    }
}
