package Context;


import Context.Personagem;
import java.util.ArrayList;
import java.util.Observable;

public abstract class Jogador extends Personagem {

    private ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();

    // public abstract void atualizar(Personagem p);
    public void update(Observable subject, Object arg) {
        Inimigo p = (Inimigo) subject;
        if (p instanceof Inimigo1) {
            System.out.println("Posicao alterada do Inimigo1. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }
        if (p instanceof Inimigo2) {
            System.out.println("Posicao alterada do Inimigo2. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }
        if (p instanceof Inimigo3) {
            System.out.println("Posicao alterada do Inimigo3. Nova posicao: (" + p.getX() + "," + p.getY() + ")");
        }

    }
}
