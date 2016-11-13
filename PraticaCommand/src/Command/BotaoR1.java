package Command;

import Context.Personagem;
//concrete  command
public class BotaoR1 implements Command {
	Personagem p;
	
	BotaoR1(Personagem p1) {
		this.p = p1;
	}
	
	public String toString()
	{
		return p.getNome()+" foi pra cima";
	}
	
	public void execute()
	{
		this.p.correr();
	}
	
}
