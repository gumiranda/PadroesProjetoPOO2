/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Context.Personagem;

/**
 *
 * @author Lara
 */
public class Abismo extends Folha {
    public void entrar(Personagem p){
        System.out.println("O personagem "+p.getNome()+" caiu no abismo");
    }
}
