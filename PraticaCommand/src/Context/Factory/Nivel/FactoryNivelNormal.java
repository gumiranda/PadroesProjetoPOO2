package Context.Factory.Nivel;


import Strategy.Ataque.Ataque;
import Context.Elemento.Bomba;
import Context.Elemento.Buraco;
import Context.Elemento.Elemento;
import Context.Fase.InimigoFase1;
import Strategy.Decorator.Dano2x;
import Strategy.Escudo.Escudo;
import Context.Factory.FabricaDeEscudos;
import Context.Factory.FabricaDePersonagem;
import Context.Factory.FabricaDePersonagemComEstrategias;
import Context.Fase.InimigoFase1;
import Context.Personagem;
import Strategy.Decorator.Poder1;
import Strategy.Decorator.Poder2;
import Strategy.Decorator.Poder;
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
public class FactoryNivelNormal extends AbstractFactoryNivel {
     private static AbstractFactoryNivel instancia = new FactoryNivelNormal();
     private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    private ArrayList<Poder> poderes = new ArrayList<Poder>();
    
     private FactoryNivelNormal(){
        
    }
    
    public static AbstractFactoryNivel getInstancia(){
        return instancia;
    }
    
    public Personagem criarInimigo(){
       FabricaDePersonagem fabrica = FabricaDePersonagemComEstrategias.getInstancia();
    return fabrica.criarInimigo();
    }
    
    public ArrayList<Elemento> criarObstaculo(){
       Elemento bomba = new Bomba();
       Elemento buraco = new Buraco();
       Elemento inimigo = new InimigoFase1();
       elementos.add(bomba);
       elementos.add(buraco);
       elementos.add(inimigo);
       return elementos;
    }
    
    public void decorarAtaqueInimigo(Ataque a){
        a = new Poder1(a); // no nivel normal ataques de inimigos são decorados com mais poderes que no nivel facil
        a = new Poder2(a);
        a = new Dano2x(a);
    }
    

    public void determinarDanoAtaque(Ataque a){
       a.setDano(10); // no nivel normal os ataques tem danos maiores que no nivel facil
   }
    
    public Escudo criarEscudos(){
        FabricaDeEscudos fabrica = FabricaDeEscudos.getInstancia();
       return  fabrica.criarCadeiaEscudosNivelNormal();
    }
}
