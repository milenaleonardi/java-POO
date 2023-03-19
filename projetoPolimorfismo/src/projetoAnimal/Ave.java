package projetoAnimal;

public class Ave extends Animal{
	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Criando ninho... ");
		
	}
	@Override
	public void locomover() {
		System.out.println("Locomoção: voando.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas e sementes. ");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de gorjeio. ");
		
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public String getCorPena() {
		return corPena;
	}
	
}
