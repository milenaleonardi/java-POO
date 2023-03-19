package projetoAnimal;

public class Canguru extends Mamifero{
	
	@Override
	public void locomover() {
		System.out.println("Locomoção: saltando. ");
	}
	
	public void usarBolsa() {
		System.out.println("Usando bolsa...");
	}
}
