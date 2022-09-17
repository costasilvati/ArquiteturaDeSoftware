
public class ArCommand implements Command{
	
	public ArCondicionado arCondicionado;
	
	public ArCommand(ArCondicionado ar) {
		this.arCondicionado = ar;
	}
	
	
	@Override
	public void execute() {
		arCondicionado.ligar();
	}

	@Override
	public void undo() {
		arCondicionado.desligar();
		
	}

}
