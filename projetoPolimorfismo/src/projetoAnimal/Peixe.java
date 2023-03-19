package projetoAnimal;

public class Peixe extends Animal{
	private String corEscama;
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhasºººº");
	}
	@Override
	public void locomover() {
		System.out.println("Locomoção: nadando.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo plânctons. ");
	}

	@Override
	public void emitirSom() {
		System.out.println("Sem emissão de sons. ");		
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String getCorEscama() {
		return corEscama;
	}

}
