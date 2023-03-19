package projetoAnimalpt2;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		System.out.println("\nMamifero: ");
		m.emitirSom();
		System.out.println("\nLobo: ");
		l.emitirSom();
		System.out.println("\nCachorro: ");
		c.emitirSom();
		
		c.reagir("Ola");
		c.reagir(9, 00);
		c.reagir(2, 5);
		c.reagir(true);
		c.reagir(false);
	}
}
