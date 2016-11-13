/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context.Factory;

import Composite.Abismo;
import Composite.Labirinto;
import Composite.Saida;
import Composite.Sala;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author root
 */
public class FabricaLabirintos {
    
      public ArrayList<Labirinto> elementos = new ArrayList<>();

  
    
    public ArrayList<Labirinto> criarCaminho(){
 Random gerador = new Random();
int coisas = gerador.nextInt(332);
int i;
for(i=0;i<coisas;i++){
            Sala sala = new Sala();
            Abismo abismo = new Abismo();
            Saida saida = new Saida();
            elementos.add(sala);
            elementos.add(abismo);
            elementos.add(saida);
}
return elementos;
    }
    
    
}
