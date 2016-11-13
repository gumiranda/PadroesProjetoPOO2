package Strategy.Decorator;


import Strategy.Ataque.Ataque;
import Context.Personagem;
import Strategy.Decorator.Poder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11421BCC021
 */
public class Poder1 extends Poder {

   
    
    public Poder1(Ataque ataque) {
        super(ataque);
        
    }

    @Override
public void atacar(Personagem p) {
ataque.setDano(ataque.getDano()*2); //multiplica o dano do ataque por 2
ataque.atacar(p);
System.out.println("Poder1 sendo utilizado");
    }

   
    
}
