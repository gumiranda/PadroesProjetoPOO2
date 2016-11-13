/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Context.Personagem;

/**
 *
 * @author a11421BCC021
 */
public abstract class Estado {
    private Personagem p ;
    private int vidaInferior,vidaSuperior;
    public Estado(Personagem p){
        this.p = p;
        setLimites();
    }
    protected abstract void setLimites();
    protected abstract void verificarAlteracaoEstado();
    public void setVidaInferior(int vida){
        this.vidaInferior = vida;
    }
    public void setVidaSuperior(int vida){
        this.vidaSuperior = vida;
    }
    public int getVidaInferior(){
        return this.vidaInferior;
        
    }
    public int getVidaSuperior(){
        return this.vidaSuperior;
        
    }
    public Personagem getPersonagem(){
     return this.p   ;
    }
    public void pegaMoedinha(){
    this.getPersonagem().setVida(this.getPersonagem().getVida()+ 5);
    this.verificarAlteracaoEstado();
}
}
