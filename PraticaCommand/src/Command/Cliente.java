/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Context.Inimigo1;
import Context.Jogador1;
import Context.Personagem;

public class Cliente {

	public static void main(String[] args) {
            Personagem  p = new Jogador1();
            Personagem i  = new Inimigo1(); 
		//receiver
		MacroCombo meuMacro = new MacroCombo();
		meuMacro.addCommand(new BotaoQuadrado(p));
		meuMacro.addCommand(new BotaoBolinha(p,i));
		meuMacro.addCommand(new BotaoDireita(p));
		meuMacro.addCommand(new BotaoEsquerda(p));

		//invoker executando a sequencia de commands
		Invoker inv = new Invoker(p.getNome());
		inv.setMacro(meuMacro);
	
		inv.executaMacro();
		

	}

}