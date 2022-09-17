
public class Main {

	public static void main(String[] args) {
		Luz luzCozinha = new Luz("Cozinha");
		LuzCommand commandLuzCozinha = new LuzCommand(luzCozinha);
		//LuzCommand commandLuzCoz = new LuzCommand(new Luz("Cozinha"));
		
		ArCommand arSala = new ArCommand(new ArCondicionado());
		
		RemoteControl controle = new RemoteControl();
		controle.addDevice(0, arSala);
		controle.addDevice(1, commandLuzCozinha);
		controle.ligar(0);
		controle.ligar(1);
		

	}

}
