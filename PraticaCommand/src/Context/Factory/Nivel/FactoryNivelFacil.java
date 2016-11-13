package Context.Factory.Nivel;


import Strategy.Ataque.Ataque;
import Context.Elemento.Bomba;
import Context.Elemento.Elemento;
import Strategy.Escudo.Escudo;
import Context.Factory.FabricaDeEscudos;
import Context.Factory.FabricaDePersonagem;
import Context.Factory.FabricaDePersonagemComEstrategias;
import Context.Personagem;
import Strategy.Decorator.Poder1;
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
public class FactoryNivelFacil extends AbstractFactoryNivel {
     private static AbstractFactoryNivel instancia = new FactoryNivelFacil();
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    private ArrayList<Poder> poderes = new ArrayList<Poder>();
    
     private FactoryNivelFacil(){
        
    }
    
    public static AbstractFactoryNivel getInstancia(){
        return instancia;
    }
    
    public Personagem criarInimigo(){
       FabricaDePersonagem fabrica = FabricaDePersonagemComEstrategias.getInstancia(); // os inimigos do nivel facil não tem armas (poderes, danos maiores nos ataques...)
    return fabrica.criarInimigo();
    }
    
    public ArrayList<Elemento> criarObstaculo(){
       Elemento bomba = new Bomba();
       elementos.add(bomba);
       return elementos;
    }
    
    public void decorarAtaqueInimigo(Ataque a){
        Poder poder1 = new Poder1(a); // no nivel facil ataques de inimigos são decorados com apenas um poder
    }
    

    public void determinarDanoAtaque(Ataque a){
       a.setDano(5); // no nivel facil o ataques tem danos menores
   }
    
    public Escudo criarEscudos(){
        FabricaDeEscudos fabrica = FabricaDeEscudos.getInstancia();
       return  fabrica.criarCadeiaEscudosNivelFacil();
    }
}
