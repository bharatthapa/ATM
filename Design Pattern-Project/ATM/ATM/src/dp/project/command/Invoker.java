package dp.project.command;

import java.util.Stack;

public class Invoker {

	// private List<ICommand> list = new ArrayList<ICommand>();
	private Stack<ICommand> stack = new Stack<ICommand>();

	public boolean pushAndExecute(ICommand command) {

		if (command.execute()){
			stack.push(command);
			return true;
		}
		else{
			undo();
			return false;
		}

	}

	public void undo() {

		while (!stack.isEmpty()) {
			ICommand cmd = stack.pop();
			cmd.undo();
		}
	}

}
