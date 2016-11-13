package Command;

import Context.Personagem;
//concrete  command
public class BotaoDireita implements Command {
	Personagem p;
	
	BotaoDireita(Personagem p1) {
		this.p = p1;
	}
	
	public String toString()
	{
		return p.getNome()+" foi pra cima";
	}
	
	public void execute()
	{
		this.p.IrPraDireita();
	}
	
}
