package Context.Factory;


import Context.Elemento.Obstaculo;
import Context.Personagem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
public class BarreiraEspinhos extends Obstaculo {
   public void confrontar(Personagem p){
       System.out.println("Personagem " +p.getNome()+" confrotado por "+this.getClass().getName());
       if(p.getPulo() == null){ // se o personagem não tiver a estrategia Pulo, a vida sera decrementada, caso contrario ele pula o obstaculo
        p.decrementarVida(20);
        System.out.println("Personagem " +p.getNome()+" danificado por " +this.getClass().getName()+".Vida do personagem: "+p.getVida());
    }
        else{
            p.pular();
              System.out.println("Personagem " +p.getNome()+" escapou de " +this.getClass().getName());
        }
}
}
