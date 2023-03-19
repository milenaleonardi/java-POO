package projetoAnimal;

public class Cachorro extends Mamifero {

	@Override
	public void locomover() {
		System.out.println("Locomoção: correndo. ");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
}
