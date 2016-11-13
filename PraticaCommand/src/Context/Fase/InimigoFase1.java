package Context.Fase;


import Context.Elemento.Elemento;
import Strategy.Ataque.Ataque;
import Strategy.Ataque.AtaqueForte;
import Strategy.Corrida.CorrerMedio;
import Strategy.Escudo.Escudo;
import Context.Factory.FabricaDeEscudos;
import Context.Inimigo;
import Context.Personagem;
import Context.Personagem;
import Strategy.Pulo.PuloMedio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
public class InimigoFase1 extends Inimigo implements Elemento {
    
    public InimigoFase1(){
        super.setPulo(new PuloMedio());
        super.setCorrer(new CorrerMedio());
        super.setAtaque(new AtaqueForte(10));
    }
    
  
    public void confrontar(Personagem p){
        this.atacar(p);
        Ataque ataque = this.getAtaque();
         FabricaDeEscudos cadeiaEscudos = FabricaDeEscudos.getInstancia();
         Escudo escudo1 = cadeiaEscudos.criarCadeiaEscudos();
         escudo1.inibirAtaque(ataque, this);
         
}
}
