package Strategy.Escudo;


import Strategy.Ataque.Ataque;
import Strategy.Ataque.AtaqueNeve;
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
public class EscudoNeve extends Escudo {
   
  
     public void inibirAtaque(Ataque ataque, Personagem p) {
        if (ataque instanceof AtaqueNeve) {
  System.out.println("Ataque neve no personagem "+ataque.getPersonagemAtacado().getNome()+" inibido!");        }     
      else  if (this.getSucessor() != null) {
            this.getSucessor().inibirAtaque(ataque, p);
        } else {
           // o ataque ao personagem é feito e sua vida é decrementada
                    ataque.getPersonagemAtacado().decrementarVida(ataque.getDano());
                    //imprime na tela que o ataque do personagem foi realizado sem que um escudo o inibisse 
            System.out.println("O personagem "+ ataque.getPersonagemAtacado().getNome()+ " foi atacado e esta com vida "+ataque.getPersonagemAtacado().getVida());
      }
  
}
}
