
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    int escolha, fase;
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int fuga = rand.nextInt(100);

    void Jogar(int inicia, Jogador jogadorSelecionado) {

        if (inicia == 1) {
            System.out.println("Iniciando...");
            System.out.println("Seu personagem: " + jogadorSelecionado.getNome());
            fase = 1;
            Fase1(jogadorSelecionado);
        } else {
            System.out.println("Você saiu do jogo!");
        }

    }

    void Fase1(Jogador jogadorSelecionado) {

        while (fase == 1) {
            System.out.println(jogadorSelecionado.getNome() + " tem 3 caminhos para encontrar o tesouro perdido.\n (1 - Esquerda / 2 - Direita / 3 - Seguir em frente / 4 - Sair do jogo)");
            escolha = in.nextInt();
            if (escolha == 1) {
                System.err.println("caminho 1");
                fase++;
                Fase2(escolha, jogadorSelecionado);
            } else if (escolha == 2) {
                System.err.println("caminho 2");
                fase++;
                Fase2(escolha, jogadorSelecionado);
            } else if (escolha == 3) {
                System.err.println("caminho 3");
                fase++;
                Fase2(escolha, jogadorSelecionado);
            } else if (escolha == 4) {
                System.out.println("Você saiu do jogo");
                fase = 0;
            } else {
                System.err.println("Valor inválido!");
            }
        }
    }

    void Fase2(int escolha, Jogador jogadorSelecionado) {
        switch (escolha) {
            case 1:
                while (fase == 2) {
                    System.out.println(jogadorSelecionado.getNome() + " tropeçou e caiu num buraco!");
                    jogadorSelecionado.tomaDano(100);
                    fase = 0;
                }
                break;
            case 2:
                while (fase == 2) {
                    System.out.println(jogadorSelecionado.getNome() + " encontrou um inimigo \n (1 - Fugir / 2 - Bater)");
                    escolha = in.nextInt();
                    if (escolha == 1) {
                        if (fuga < 51) {
                            System.err.println("Você fugiu.");
                            fase = 0;
                        }
                    } else if (escolha == 2) {
                        System.err.println(jogadorSelecionado.getNome() + " deu dano: " + jogadorSelecionado.Ataque());

                    } else {
                        System.err.println("Valor inválido!");
                    }
                }
                break;
            case 3:
                //escolha = in.nextInt();
                break;
            case 4:

                break;
        }

    }

}
