package dp.project.command;


public interface ICommand {
	
	public boolean execute();
	public boolean undo();

}
