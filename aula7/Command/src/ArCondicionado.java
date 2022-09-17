
public class ArCondicionado {
	int temperatura;
	String modo;
	int velocidade;
	int balanco;
	
	public ArCondicionado() {
		this.temperatura = 23;
		this.modo = "automático";
		this.velocidade = 3;
		this.balanco = -1;
	}
	
	public void ligar() {
		System.out.println("Ar Condicionado ligado:\n" + this.toString());
	}
	
	public void desligar() {
		System.out.println("Desligando o Ar Condicionado...");
	}

	@Override
	public String toString() {
		return "ArCondicionado [temperatura=" + temperatura + ", modo=" + modo + ", velocidade=" + velocidade
				+ ", balanco=" + balanco + "]";
	}
	
	
}
