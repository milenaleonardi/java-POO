
public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("----Renovando bolsa do aluno " + this.getNome() + "----");
	}
	
	@Override
	public void pagarMensal() {
		System.out.println(this.getNome() + "é bolsista! Pagamento facilitado com " + this.getBolsa() + " de desconto. ");
	}
	
	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public float getBolsa() {
		return bolsa;
	}
}
