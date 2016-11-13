/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Context.Personagem;
import Strategy.Ataque.AtaqueMedio;
import Strategy.Corrida.CorrerMedio;

/**
 *
 * @author a11421BCC021
 */
public class EstadoMorto extends Estado {
    public EstadoMorto(Personagem p) {
        super(p);
        System.out.println("Personagem está morto - game over");
    }
public void pegaMoedinha(){
System.out.println("O personagem esta tao vivo quanto a moeda");
}
public void verificarAlteracaoEstado(){
    if(this.getPersonagem().getVida()<this.getVidaInferior()){
    this.getPersonagem().setVida(0);
    }
   
}
  @Override
    protected void setLimites() {
        this.setVidaInferior(0);
        this.setVidaSuperior(0);
    }
}
