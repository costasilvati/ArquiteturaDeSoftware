
public class Luz {
	String nome;
	
	public Luz (String nome) {
		this.nome = nome;
	}
	
	public void on() {
		System.out.println("A luz " + this.nome + "esta ligada!");
	}

	public void off() {
		System.out.println("A luz " + this.nome + "esta desligada!");
	}
}
