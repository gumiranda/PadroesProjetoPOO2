package Context.Fase;


import Context.Elemento.Bomba;
import Context.Elemento.Buraco;
import Context.Elemento.Elemento;
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
public class FaseConcreta1 extends Fase {
    private static Fase instancia = new FaseConcreta1();
    
   private FaseConcreta1(){
       super();
   }
   
   public static Fase getInstancia(){
       return instancia;
   }
   
    protected ArrayList<Elemento> factoryMethod(){
        ArrayList<Elemento> elementos = new ArrayList<Elemento>();
     
        elementos.add(new InimigoFase1());
        elementos.add(new Buraco());
        elementos.add(new Bomba());
        return elementos;
        
    }
    
}
