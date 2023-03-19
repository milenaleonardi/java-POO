package projetoAnimalpt2;

public class Cachorro extends Lobo{
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au! ");
	}
	
	//polimorfismo de sobrecarga
	public void reagir(String frase) {
		if(frase == "Ola" || frase == "Carinho") {
			System.out.println("[Reação={Abanar e Latir}.\n");
		} else {
			System.out.println("[Reação={Rosnar}.\n");
		}
	}
	
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("[Reação={Abanar}.\n");
		} else if(hora >= 18) {
			System.out.println("[Reação={Ignorar}.\n");
		} else {
			System.out.println("[Reação={Abanar e Latir}.\n");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("[Reação={Abanar}.\n");
		} else {
			System.out.println("[Reação={Rosnar e Latir}.\n");
		}
		
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10) {
				System.out.println("[Reação={Abanar}.\n");
			} else {
				System.out.println("[Reação={Latir}.\n");
			} 
			if(peso < 10) {
				System.out.println("[Reação={Rosnar}.\n");
			} else {
				System.out.println("[Reação={Ignorar}.\n");
			}
		}
		
	}
	
}
