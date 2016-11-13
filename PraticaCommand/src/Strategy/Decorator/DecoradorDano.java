package Strategy.Decorator;


import Strategy.Ataque.Ataque;
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
public abstract class DecoradorDano extends Ataque {
    Ataque ataque;
    public DecoradorDano(Ataque ataque){
        this.ataque = ataque;
    }
    
    public abstract void atacar(Personagem p);
}
