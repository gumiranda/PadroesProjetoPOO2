package Strategy.Escudo;


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
public abstract class Escudo {
    private Escudo sucessor;
    private Personagem per;

 
    public void setSucessor(Escudo escudo){
        this.sucessor = escudo;
    }
    
    public Escudo getSucessor(){
        return this.sucessor;
    }
    public Personagem getPersonagem(){
        return this.per;
    }
    
    public abstract void inibirAtaque(Ataque ataque, Personagem p);
   

    private void setPersonagem(Personagem per) {
this.per = per;
    }
    
}
