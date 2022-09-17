
public class RemoteControl {
	private Command[] onCommand;
	
	private static int slots = 4;
	
	public RemoteControl() {
		this.onCommand = new Command[slots];
	}
	
	public boolean addDevice(int slot, Command device) {
		if(this.onCommand[slot] == null) {
			this.onCommand[slot] = device;
			return true;
		}
		return false;
	}
	
	public void ligar(int slot) {
		if(this.onCommand[slot] != null) {
			this.onCommand[slot].execute();
		}
	}
	
	public void desligar(int slot) {
		if(this.onCommand[slot] != null) {
			this.onCommand[slot].undo();
		}
	}
	
	

}
