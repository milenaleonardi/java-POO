import java.util.Random;

public class Luta {
	
	//Atributos
	private Lutador desafiado; //Lutador é um tipo abstrato de dado
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//Métodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if(this.getAprovada()) {
			System.out.println("#### DESAFIADO ####");
			this.desafiado.apresentar();
			System.out.println("#### DESAFIANTE ####");
			this.desafiante.apresentar();
			
			//Seleciona valor aleatório para vencedor
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("======= RESULTADO DA LUTA ========");
			switch(vencedor) {
			case 0:
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("Luta não pode acontecer.");
		} 
		System.out.println("===========================");
	}
	
	//Constructor
	public Luta() {
		
	}
	
	//Métodos setters e getters
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public boolean getAprovada() {
		return aprovada;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public int getRounds() {
		return rounds;
	}
}
