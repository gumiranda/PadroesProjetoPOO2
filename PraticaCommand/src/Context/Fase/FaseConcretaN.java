package Context.Fase;


import Context.Elemento.Armadilha;
import Context.Elemento.Elemento;
import Context.Factory.BarreiraEspinhos;
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
public class FaseConcretaN extends Fase {
    private static Fase instancia = new FaseConcretaN();
    
    private FaseConcretaN(){
        super();
    }
  
    public static Fase getInstancia(){
        return instancia;
    }
    
   protected ArrayList<Elemento> factoryMethod(){
        ArrayList<Elemento> elementos = new ArrayList<Elemento>();
        elementos.add(new InimigoFaseN());
        elementos.add(new BarreiraEspinhos());
        elementos.add(new Armadilha());
        return elementos;
        
    }  
}
