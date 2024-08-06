package com.joguinho;
import java.util.Scanner;
import java.util.ArrayList;

public class Jogo {

    public void Jogar(int inicia, ArrayList<jogadores> jogadores, int escolha) {
        
        if (inicia == 1) {
            System.out.println("Iniciando...");
            System.out.println("Seu personagem: ");
        } else {
            System.out.println("Voce saiu do jogo");
        }
    }
}
