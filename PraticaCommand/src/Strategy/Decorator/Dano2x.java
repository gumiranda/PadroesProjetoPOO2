package Strategy.Decorator;


import Strategy.Ataque.Ataque;
import Strategy.Decorator.DecoradorDano;
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
public class Dano2x extends DecoradorDano {
    public Dano2x(Ataque ataque){
        super(ataque);
    }
    
    public void atacar(Personagem p1){
        ataque.setDano((ataque.getDano())*2);
        ataque.atacar(p1);
        
    }
}
