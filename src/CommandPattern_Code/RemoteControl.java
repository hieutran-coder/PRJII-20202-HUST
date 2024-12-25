package CommandPattern_Code;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new Nocommand[];
		
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWashPushed(int slot) {
		offCommands[slot].excute();
	}

	

	
	
	
	
}
