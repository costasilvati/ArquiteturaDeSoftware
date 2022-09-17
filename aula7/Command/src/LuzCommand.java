
public class LuzCommand implements Command{
	public Luz luz;
	
	public LuzCommand(Luz luz) {
		this.luz = luz;
	}
	
	
	@Override
	public void execute() {
		luz.on();
	}

	@Override
	public void undo() {
		luz.off();
		
	}

}
