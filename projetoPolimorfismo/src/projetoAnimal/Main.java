package projetoAnimal;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.setDieta("Carnivoro");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("\n");
		
		a.locomover();
		p.locomover();
		r.locomover();
		System.out.println("\n");
		
		Canguru c = new Canguru();
		Cachorro ch = new Cachorro();
		Cobra cr = new Cobra();
		Tartaruga t = new Tartaruga();
		PeixeDourado pd = new PeixeDourado();
		Arara ar = new Arara();
		
		c.locomover();
		ch.locomover();
		ch.emitirSom();
		System.out.println("\n");
		
		cr.locomover();
		cr.emitirSom();
	}
}
