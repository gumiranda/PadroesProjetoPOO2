package Context;


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
public class Inimigo3 extends Inimigo {
  
    public void atualizar(Personagem p){
    System.out.println("\nPosicao alterada. Nova posicao: (" +p.getX()+ ","+p.getY()+")");
}
    public String getNome(){
        return "Inimigo 3";
    }
}
