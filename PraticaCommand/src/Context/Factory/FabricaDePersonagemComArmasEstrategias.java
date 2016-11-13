package Context.Factory;


import Strategy.Ataque.AtaqueFogo;
import Strategy.Ataque.AtaqueForte;
import Strategy.Ataque.AtaqueMedio;
import Strategy.Ataque.AtaqueNeve;
import Strategy.Ataque.AtaqueTerra;
import Strategy.Corrida.CorrerMedio;
import Strategy.Corrida.CorrerRapido;
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
import Strategy.Decorator.Poder3;
import Strategy.Pulo.PuloAlto;
import Strategy.Pulo.PuloBaixo;
import Strategy.Pulo.PuloMedio;
import java.util.Random;

// cria personagens com decoradores no ataque e estrategias (pulo, corrida)
public class FabricaDePersonagemComArmasEstrategias extends FabricaDePersonagem {
    private static FabricaDePersonagemComArmasEstrategias instancia = new FabricaDePersonagemComArmasEstrategias(); // atributo que guarda a unica instancia da classe

    private FabricaDePersonagemComArmasEstrategias(){
        super();
    }
    
    public Personagem criarJogador() {
        Personagem p = null;

        Random gerador = new Random();
        int tipo = gerador.nextInt(3);
        if (tipo == 0) {
            p = new Jogador1();
            p.setAtaque(new Poder1(new AtaqueNeve(10)));
            p.setPulo(new PuloMedio());
            p.setCorrer(new CorrerMedio());
        }
        if (tipo == 1) {
            p = new Jogador2();
            p.setPulo(new PuloAlto());
            p.setCorrer(new CorrerRapido());
            p.setAtaque(new Dano2x(new AtaqueFogo(10)));
        }
        if (tipo == 2) {
            p = new Jogador3();
            p.setPulo(new PuloBaixo());
            p.setCorrer(new CorrerRapido());
            p.setAtaque(new Poder2(new AtaqueTerra(10)));
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
            p.setPulo(new PuloMedio());
            p.setCorrer(new CorrerMedio());
            p.setAtaque(new Dano3x(new AtaqueNeve(10)));
        }
        if (tipo == 1) {
            p = new Inimigo2();
            p.setPulo(new PuloAlto());
            p.setCorrer(new CorrerMedio());
            p.setAtaque(new Poder1(new AtaqueMedio(10)));
        }
        if (tipo == 2) {
            p = new Inimigo3();
            p.setPulo(new PuloMedio());
            p.setCorrer(new CorrerRapido());
            p.setAtaque(new Poder3(new AtaqueForte(10)));
        }
        return p;
    }
    
    public static FabricaDePersonagemComArmasEstrategias getInstancia(){
        return instancia;
    }
}
