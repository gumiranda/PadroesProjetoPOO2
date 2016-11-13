package Strategy.Ataque;


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
public class AtaqueTerra extends Ataque{
    public AtaqueTerra(int dano){
        super.setDano(dano);
    }
     public void atacar(Personagem p){
       
        super.setPersonagemAtacado(p);//setta o personagem atacado para usarmos ele no escudo
        System.out.println("Ataque terra");
    }
}
