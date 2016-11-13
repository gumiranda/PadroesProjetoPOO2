package Context;


import Context.Jogador;
import Context.Jogador1;
import Context.Personagem;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public abstract class Inimigo extends Personagem {

    public void update(Observable subject, Object arg) {
        Personagem p = (Personagem) subject;
        if (p instanceof Jogador1) {
            System.out.println("Posicao alterada do jogador1. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }
        if (p instanceof Jogador2) {
            System.out.println("Posicao alterada do jogador2. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }
        if (p instanceof Jogador3) {
            System.out.println("Posicao alterada do jogador3. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }
    }
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

}
