package Context.Elemento;


import Context.Elemento.Elemento;
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
public class Bomba implements Elemento {
    public void confrontar(Personagem p){
    System.out.println("Personagem " +p.getNome()+" confrotado por "+this.getClass().getName());
       if(p.getCorrida() == null){ // se o personagem não tiver a estrategia Correr, a vida sera decrementada, caso contrario ele corre da bomba
        p.decrementarVida(20);
        System.out.println("Personagem " +p.getNome()+" danificado por " +this.getClass().getName()+".Vida do personagem: "+p.getVida());
    }
        else{
            p.correr();
            System.out.println("Personagem " +p.getNome()+" escapou de " +this.getClass().getName());
        }  
    }
}
