package Context.Factory.Nivel;


import Strategy.Ataque.Ataque;
import Context.Elemento.Elemento;
import Strategy.Escudo.Escudo;
import Context.Personagem;
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
public abstract class AbstractFactoryNivel {
    public abstract Personagem criarInimigo();
    public abstract ArrayList<Elemento> criarObstaculo();
    public abstract void decorarAtaqueInimigo(Ataque a);
    public abstract void determinarDanoAtaque(Ataque a);
    public abstract Escudo criarEscudos();
}
