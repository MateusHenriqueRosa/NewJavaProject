
import java.util.Random;

public class Jogador {

    String nome;
    double altura, tamPe;
    int vida = 100;
    Random rand = new Random();

    public Jogador(String nome, double altura, double tamPe) {
        this.nome = nome;
        this.altura = altura;
        this.tamPe = tamPe;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getTamPe() {
        return tamPe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setTamPe(double tamPe) {
        this.tamPe = tamPe;
    }

    public void tomaDano(int dano) {
        this.vida -= dano;
        if (vida <= 0) {
            System.out.println("Perdeu o jogo! Você é ruim");
        }
    }

    public int Ataque() {
        int ataque = rand.nextInt(30, 50);
        return ataque;
    }

}
