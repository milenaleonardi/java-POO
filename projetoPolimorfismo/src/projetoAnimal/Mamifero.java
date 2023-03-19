package projetoAnimal;

public class Mamifero extends Animal {
	private String corPelo;
	private String dieta;

	@Override
	public void locomover() {
		System.out.println("Locomoção: andando. ");
		
	}

	@Override
	public void alimentar() {
		if (this.dieta == "Carnivoro") {
			System.out.println("Comendo carne. ");
		} else if (this.dieta == "Herbivoro") {
			System.out.println("Comendo vegetais. ");
		}
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mamífero. ");
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	
	public String getDieta() {
		return dieta;
	}
	
	
}
