package Command;

import Context.Personagem;
//concrete  command
public class BotaoXis implements Command {
	Personagem p;
	
	BotaoXis(Personagem p1) {
		this.p = p1;
	}
	
	public String toString()
	{
		return p.getNome()+" foi pra cima";
	}
	
	public void execute()
	{
		this.p.soltaMagia();
	}
	
}
