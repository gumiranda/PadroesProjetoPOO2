/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;
import java.util.ArrayList;

public class MacroCombo implements Command {
	ArrayList<Command> commands = new ArrayList<Command>();
	
	public MacroCombo() {}
	
	public void addCommand(Command c)
	{
		this.commands.add(c);
	}
	
	public void execute()
	{
		for(Command c: commands) {
			c.execute();
		}
	}
}