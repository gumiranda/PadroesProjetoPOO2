/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;




import java.util.ArrayList;

//INVOKER
public class Invoker {
	private String nome;
	private ArrayList<Command> log = new ArrayList<Command>();
	
	Invoker(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	Command meuMacro;
	
	public void setMacro(Command c)
	{
		meuMacro = c;
	}
        public void executaMacro()
	{
		meuMacro.execute();
	}
	
	public void exibirLog()
	{
		System.out.println("--------------------------");
		System.out.println("Log: ");
		for(int i = 0; i < log.size(); i++)
		{
			System.out.println(log.get(i).toString());
		}
		System.out.println("--------------------------");
	}
	
	public void enviarComando(Command comando) {
		System.out.println("Ação: " + this.nome);
		log.add(comando);
		comando.execute();
	}
	
}