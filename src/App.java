import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogo jogo = new Jogo();

        Scanner in = new Scanner(System.in);
        int resposta;

        System.out.println("Deseja cadastrar jogadores? (1 - sim/ 0 - não)");
        resposta = in.nextInt();
        int sair = 1;
        int cont = 1;
        int jogar;
        int escolha;

        if (resposta == 1) {

            while (sair == 1) {
                String nome;
                double altura, tamPe;
                System.out.println("Digite o nome");
                nome = in.next();
                System.out.println("Digite o tamanho");
                altura = in.nextDouble();
                System.out.println("Digite o tamanho do Pé");
                tamPe = in.nextDouble();
                Jogador jogador = new Jogador(nome, altura, tamPe);

                jogadores.add(jogador);

                System.out.println("Deseja cadastrar mais um jogador? (1 - sim/ 0 - não)");
                sair = in.nextInt();
            }

            for (Jogador jogador : jogadores) {
                System.out.println("Jogador " + cont + ": " + jogador.getNome() + " " + String.valueOf(jogador.getAltura()) + " " + String.valueOf(jogador.getTamPe()));
                cont++;
            }

            System.out.println("Escolha um jogador para jogar: (Escolha pelo numero!)");
            escolha = in.nextInt();
            Jogador jogadorSelecionado = jogadores.get(escolha - 1);

            System.out.println("Jogador escolhido: " + jogadorSelecionado.getNome() + " " + jogadorSelecionado.getAltura() + " " + jogadorSelecionado.getTamPe());

            System.out.println("Deseja jogar o jogo? (1 - sim/ 0 - não)");
            jogar = in.nextInt();
            jogo.Jogar(jogar, jogadorSelecionado );
        } else {
            jogar = 0;
            escolha = 0;
            Jogador jogadorSelecionado = jogadores.get(escolha - 1);
            jogo.Jogar(jogar,jogadorSelecionado);
        }
        in.close();
    }

}
