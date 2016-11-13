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
public class EstadoNormal extends Estado {
    public EstadoNormal(Personagem p) {
        super(p);
        p.setAtaque(new AtaqueMedio(10));
        p.setCorrer(new CorrerMedio());
        
    }
public void pegaMoedinha(){
    this.getPersonagem().setVida(this.getPersonagem().getVida()+ 7);
    this.verificarAlteracaoEstado();
}
public void verificarAlteracaoEstado(){
    if(this.getPersonagem().getVida()< this.getVidaInferior()){
        this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
        this.getPersonagem().getEstado().verificarAlteracaoEstado();
    }
    else if(this.getPersonagem().getVida()>this.getVidaSuperior()){
        this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
    }
}
    @Override
    protected void setLimites() {
        this.setVidaInferior(30);
        this.setVidaSuperior(70);
    }
    
}
