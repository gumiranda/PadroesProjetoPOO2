/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Context.Personagem;
//concrete  command
public class BotaoBolinha implements Command {
	Personagem atacante;
	Personagem atacado;
	
	BotaoBolinha(Personagem p1, Personagem p2) {
		this.atacante = p1;
		this.atacado = p2;
	}
	
	public String toString()
	{
		return "Ataque de " + atacante.getAtaque() + " no " +atacado.getNome();
	}
	
	public void execute()
	{
		this.atacante.atacar(atacado);
	}
	
}
