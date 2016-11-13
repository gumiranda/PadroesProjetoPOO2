package Context.Factory.Nivel;


import Context.Elemento.Armadilha;
import Strategy.Ataque.Ataque;
import Context.Elemento.Bomba;
import Context.Elemento.Buraco;
import Context.Elemento.Elemento;
import Strategy.Decorator.Dano2x;
import Strategy.Decorator.Dano3x;
import Strategy.Escudo.Escudo;
import Context.Factory.FabricaDeEscudos;
import Context.Factory.FabricaDePersonagem;
import Context.Fase.InimigoFaseN;
import Context.Fase.InimigoFase1;
import Context.Factory.FabricaDePersonagemComArmasEstrategias;
import Context.Factory.FabricaDePersonagemComArmasEstrategias;
import Context.Personagem;
import Strategy.Decorator.Poder1;
import Strategy.Decorator.Poder2;
import Strategy.Decorator.Poder;
import Strategy.Decorator.Poder3;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lara
 */
public class FactoryNivelAvancado extends AbstractFactoryNivel{
    private static AbstractFactoryNivel instancia = new FactoryNivelAvancado();
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    private ArrayList<Poder> poderes = new ArrayList<Poder>();
    
    private FactoryNivelAvancado(){
        
    }
    
    public static AbstractFactoryNivel getInstancia(){
        return instancia;
    }
    
    public Personagem criarInimigo(){
       FabricaDePersonagem fabrica = FabricaDePersonagemComArmasEstrategias.getInstancia(); // no nivel avançado inimigos tem armas e estrategias
    return fabrica.criarInimigo();
    }
    
    public ArrayList<Elemento> criarObstaculo(){
       Elemento bomba = new Bomba();
       Elemento buraco = new Buraco();
       Elemento inimigo = new InimigoFase1();
       Elemento armadilha = new Armadilha();
       Elemento inimigo1 = new InimigoFaseN();
       elementos.add(inimigo1);
       elementos.add(armadilha);
       elementos.add(bomba);
       elementos.add(buraco);
       elementos.add(inimigo);
       return elementos;
    }
    
    public void decorarAtaqueInimigo(Ataque a){
        a = new Poder1(a); 
        a = new Poder2(a);
        a = new Poder3(a);
        a = new Dano2x(a);
        a = new Dano3x(a);
    }
    

    public void determinarDanoAtaque(Ataque a){
       a.setDano(15); // no nivel avançado os ataques tem danos maiores 
   }
    
    public Escudo criarEscudos(){
        FabricaDeEscudos fabrica = FabricaDeEscudos.getInstancia();
       return  fabrica.criarCadeiaEscudosNivelAvancado();
    }
}
