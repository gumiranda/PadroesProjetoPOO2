package Context.Fase;


import Context.Elemento.Elemento;
import Context.Personagem;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
public abstract class Fase {
    
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    
    protected abstract ArrayList<Elemento> factoryMethod();
    
    public void jogar(Personagem p){
        elementos = factoryMethod();
        for(Elemento e : elementos){
            e.confrontar(p);
        }
    }
    
    
}
