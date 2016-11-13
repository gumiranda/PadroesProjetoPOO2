package Context.Factory.Client;


import Strategy.Ataque.Ataque;
import Strategy.Escudo.Escudo;
import Context.Factory.FabricaDeEscudos;
import Context.Factory.FabricaDePersonagem;
import Context.Factory.FabricaDePersonagemComEstrategias;
import Context.Personagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lara
 */
public class Jogo {

    FabricaDePersonagem s1; // fabrica de persoagens com armas
    FabricaDePersonagem s2; // fabrica de personagens com estrategias
    FabricaDePersonagem s3; // fabrica de personagens com armas e estrategias

   public Jogo(FabricaDePersonagem s1, FabricaDePersonagem s2, FabricaDePersonagem s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void jogar() {
  
         FabricaDePersonagem s = FabricaDePersonagemComEstrategias.getInstancia(); // uso do padrao singleton para garantir que essa eh a unica instancia da classe
        Personagem jogador1 = s.criarJogador();
        Personagem jogador2 = s.criarJogador();
        Personagem jogador3 = s.criarJogador();

        Personagem inimigo1 = s.criarInimigo();
        Personagem inimigo2 = s.criarInimigo();
        Personagem inimigo3 = s.criarInimigo();
       
        // adicionando observadores para jogadores
        jogador1.addObserver(inimigo1);
        jogador1.addObserver(inimigo2);
        jogador1.addObserver(inimigo3);
        jogador2.addObserver(inimigo1);
        jogador2.addObserver(inimigo2);
        jogador2.addObserver(inimigo3);
        jogador3.addObserver(inimigo1);
        jogador3.addObserver(inimigo2);
        jogador3.addObserver(inimigo3);

        //adicionando observadores para inimigos
        inimigo1.addObserver(jogador1);
        inimigo1.addObserver(jogador2);
        inimigo1.addObserver(jogador3);
        inimigo2.addObserver(jogador1);
        inimigo2.addObserver(jogador2);
        inimigo2.addObserver(jogador3);
        inimigo3.addObserver(jogador1);
        inimigo3.addObserver(jogador2);
        inimigo3.addObserver(jogador3);

        // testando padrao strategy e decorator
        System.out.println("\nJogador 1:");
        jogador1.pular();
        jogador1.correr();
        jogador1.atacar(jogador1); // ataque nao decorado
        jogador1.adicionarPoderes(); // metodo para decorar o ataque
        jogador1.atacar(jogador1); // ataque decorado
        System.out.println("\nJogador 2:");
        jogador2.pular();
        jogador2.correr();
        jogador2.atacar(jogador2); // ataque nao decorado
        jogador2.adicionarPoderes();
        jogador2.atacar(jogador2); // ataque decorado
        System.out.println("\nJogador 3:");
        jogador3.pular();
        jogador3.correr();
        jogador3.atacar(jogador3); // ataque nao decorado
        jogador3.adicionarPoderes();
        jogador3.atacar(jogador3); // ataque decorado

        // testando padrao observer, tanto jogadores como inimigos serao notificados 
        System.out.println("\nNotificacoes para inimigos:");
        jogador1.setPosicao(2, 3);
        jogador2.setPosicao(3, 1);
        jogador3.setPosicao(2, 0);
        System.out.println("\nNotificacoes para jogadores:");
        inimigo1.setPosicao(22, 33);
        inimigo2.setPosicao(3, 11);
        inimigo3.setPosicao(243, 210);
        
        FabricaDeEscudos cadeiaEscudos = FabricaDeEscudos.getInstancia(); // uso do padrão singleton para garantir a instancia unica
        System.out.println("\nAtaques e defesas:");
        inimigo1.atacar(jogador1);
        Ataque a1 = inimigo1.getAtaque();
        
        Escudo escudo1 = cadeiaEscudos.criarCadeiaEscudos();
        escudo1.inibirAtaque(a1, inimigo1);

        inimigo2.atacar(inimigo2);
        Ataque a2 = inimigo2.getAtaque();
        Escudo escudo2 = cadeiaEscudos.criarCadeiaEscudos(); // a fabrica de escudos gera aleatoriamente uma cadeia de escudos
        escudo2.inibirAtaque(a2, inimigo2);

        inimigo3.atacar(inimigo3);
        Ataque a3 = inimigo1.getAtaque();
        Escudo escudo3 = cadeiaEscudos.criarCadeiaEscudos(); // a fabrica de escudos gera aleatoriamente uma cadeia de escudos
        escudo3.inibirAtaque(a3, inimigo1);

        //TESTANDO DECORADOR NO DANO DO ATAQUE QUE AUMENTA O DANO
        inimigo2.decorarDano1();
        inimigo2.atacar(jogador2);
        escudo2.inibirAtaque(a2, inimigo2);

        inimigo1.decorarDano2();
        inimigo1.atacar(jogador1);
        escudo3.inibirAtaque(a1, inimigo1);

    }
}
