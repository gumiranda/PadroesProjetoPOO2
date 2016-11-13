package Strategy.Ataque;


import Context.Personagem;


public abstract class Ataque {
    Personagem personagemAtacado,personagemAtacante;
    
    
    private int dano;
    
    public void setDano(int dano){
        this.dano = dano;
    }
    
    public int getDano(){
        return this.dano;
    }
    
    // cada ataque sera aplicado a um personagem (inimigo ou jogador)
    public void setPersonagemAtacante(Personagem p){
        this.personagemAtacante = p;
    }
     public void setPersonagemAtacado(Personagem p){
        this.personagemAtacado = p;
    }
    
    public Personagem getPersonagemAtacante(){
        return this.personagemAtacante;
    }
     public Personagem getPersonagemAtacado(){
        return this.personagemAtacado;
    }
    
    public abstract void atacar(Personagem p); 
}

