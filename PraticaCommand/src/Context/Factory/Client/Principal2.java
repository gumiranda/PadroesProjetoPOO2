/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context.Factory.Client;

import Composite.Labirinto;
import Context.Factory.FabricaLabirintos;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Principal2 {
    public static void main(String []args){
                 ArrayList<Labirinto> labirintos = new ArrayList<>();
        FabricaLabirintos f = new FabricaLabirintos();
        labirintos =   f.criarCaminho();

    }
}
