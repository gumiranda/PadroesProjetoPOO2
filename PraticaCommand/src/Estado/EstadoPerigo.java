/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Context.Personagem;
import Strategy.Ataque.AtaqueFraco;
import Strategy.Ataque.AtaqueMedio;
import Strategy.Corrida.CorrerDevagar;
import Strategy.Corrida.CorrerMedio;

/**
 *
 * @author a11421BCC021
 */
public class EstadoPerigo extends Estado {
    public EstadoPerigo(Personagem p) {
        super(p);
        
        p.setAtaque(new AtaqueFraco(5));
        p.setCorrer(new CorrerDevagar());
        
    }
public void pegaMoedinha(){
    this.getPersonagem().setVida(this.getPersonagem().getVida()+ 2);
    this.verificarAlteracaoEstado();
}
public void verificarAlteracaoEstado(){
    if(this.getPersonagem().getVida()<this.getVidaInferior()){
        this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
    }
    else if(this.getPersonagem().getVida()>this.getVidaSuperior()){
        this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
        this.getPersonagem().getEstado().verificarAlteracaoEstado();
    }
}

    @Override
    protected void setLimites() {
        this.setVidaInferior(1);
        this.setVidaSuperior(30);
    }
}
