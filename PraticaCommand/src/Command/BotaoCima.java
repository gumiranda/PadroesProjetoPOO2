/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Context.Personagem;
//concrete  command
public class BotaoCima implements Command {
	Personagem p;
	
	BotaoCima(Personagem p1) {
		this.p = p1;
	}
	
	public String toString()
	{
		return p.getNome()+" foi pra cima";
	}
	
	public void execute()
	{
		this.p.IrPraCima();
	}
	
}
