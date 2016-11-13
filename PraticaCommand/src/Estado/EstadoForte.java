/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Context.Personagem;
import Strategy.Ataque.AtaqueForte;
import Strategy.Ataque.AtaqueMedio;
import Strategy.Corrida.CorrerMedio;
import Strategy.Corrida.CorrerRapido;

/**
 *
 * @author a11421BCC021
 */
public class EstadoForte extends Estado {
    public EstadoForte(Personagem p) {
        super(p);
        p.setAtaque(new AtaqueForte(15));
        p.setCorrer(new CorrerRapido());
        
    }
public void pegaMoedinha(){
    this.getPersonagem().setVida(this.getPersonagem().getVida()+ 15);
    this.verificarAlteracaoEstado();
}
public void verificarAlteracaoEstado(){
    if(this.getPersonagem().getVida()<this.getVidaInferior()){
        this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
        this.getPersonagem().getEstado().verificarAlteracaoEstado();
    }
    else if(this.getPersonagem().getVida()>this.getVidaSuperior()){
        this.getPersonagem().setVida(this.getVidaSuperior());
    }
}
    @Override
    protected void setLimites() {
        this.setVidaInferior(70);
        this.setVidaSuperior(100);
    }
}
