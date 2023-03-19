package projetoAnimal;

public class Reptil extends Animal{
	private String corEscama;
	private String dieta;
	
	@Override
	public void locomover() {
		System.out.println("Locomoção: rastejando. ");
		
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
		System.out.println("Som de reptil. ");
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	
	public void setDieta(String dieta) {
		this.dieta = dieta;
	}
	
	public String getDieta() {
		return dieta;
	}
	
}
