/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import Context.Personagem;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lara
 */

public class Sala extends Labirinto{
    private ArrayList<Labirinto> caminhos = new ArrayList<Labirinto>();
    
    public Sala(Labirinto no1, Labirinto no2){
        caminhos.add(no1);
        caminhos.add(no2);
    }

    public Sala() {
    }
    
  
    
    public int contarFilhos(){
        int cont =0;
    for(Labirinto n : caminhos){
        cont++;
    }
    return cont;
    }
    
    public void entrar(Personagem p){
    System.out.println("O jogador "+p.getNome()+"entrou em uma sala.");
    int num1  = contarFilhos();
    Random gerador = new Random();
    int num2 = gerador.nextInt(num1);
    caminhos.get(num2).entrar(p);
    
    }
    
   
 
}
