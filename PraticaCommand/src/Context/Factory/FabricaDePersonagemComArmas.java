package Context.Factory;


import Strategy.Ataque.AtaqueFogo;
import Strategy.Ataque.AtaqueForte;
import Strategy.Ataque.AtaqueMedio;
import Strategy.Ataque.AtaqueNeve;
import Strategy.Ataque.AtaqueTerra;
import Strategy.Decorator.Dano2x;
import Strategy.Decorator.Dano3x;
import Context.Inimigo2;
import Context.Jogador3;
import Context.Jogador2;
import Context.Inimigo1;
import Context.Inimigo3;
import Context.Jogador1;
import Context.Personagem;
import Strategy.Decorator.Poder1;
import Strategy.Decorator.Poder2;
import java.util.Random;

// cria personagens com decoradores no ataque
public class FabricaDePersonagemComArmas extends FabricaDePersonagem {

    private static FabricaDePersonagemComArmas instancia = new FabricaDePersonagemComArmas(); // atributo para guardar a unica instancia da classe

    private FabricaDePersonagemComArmas() {
        super();
    }

    // metodo que cria apenas jogadores
    public Personagem criarJogador() {
        Personagem p = null;
        int tipo;
        Random gerador = new Random();
        tipo = gerador.nextInt(3);
        if (tipo == 0) {
            p = new Jogador1();
            p.setAtaque(new Poder1(new AtaqueNeve(10)));
        }
        if (tipo == 1) {
            p = new Jogador2();
            p.setAtaque(new Poder2(new AtaqueFogo(10)));
        }
        if (tipo == 2) {
            p = new Jogador3();
            p.setAtaque(new Dano2x(new AtaqueTerra(10)));
        }

        return p;

    }

    //método que cria apenas inimigos
    public Personagem criarInimigo() {
        Personagem p = null;
        int tipo;
        Random gerador = new Random();
        tipo = gerador.nextInt(3);
        if (tipo == 0) {
            p = new Inimigo1();
            p.setAtaque(new Poder1(new AtaqueNeve(10)));
        }
        if (tipo == 1) {
            p = new Inimigo2();
            p.setAtaque(new Dano2x(new AtaqueMedio(10)));
        }
        if (tipo == 2) {
            p = new Inimigo3();
            p.setAtaque(new Dano3x(new AtaqueForte(10)));
        }
        return p;
    }

    public static FabricaDePersonagemComArmas getInstancia() {
        return instancia;
    }
}
