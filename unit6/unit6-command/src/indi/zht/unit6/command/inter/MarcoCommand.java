package indi.zht.unit6.command.inter;


public abstract class MarcoCommand implements Command {
	public Command[] commands; 
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(Command command: commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(Command command : commands) {
			command.undo();
		}
	}

}
