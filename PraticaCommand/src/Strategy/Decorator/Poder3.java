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
public class Poder3 extends Poder{

    public Poder3(Ataque ataque) {
        super(ataque);
    }

 public void atacar(Personagem p){
ataque.atacar(p);
System.out.println("Poder 3 sendo utilizado");
    }
    
}
