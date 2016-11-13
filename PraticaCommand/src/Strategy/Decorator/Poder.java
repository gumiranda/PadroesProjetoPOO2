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
 * @author a11421BCC021
 */
public abstract class Poder extends Ataque {
    
    Ataque ataque;
    public Poder(Ataque ataque){
        this.ataque = ataque;
    }
    public abstract void atacar(Personagem p);
}
