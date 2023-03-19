package projetoPessoas;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public void mudaTrabalho() {
		this.setTrabalhando(!trabalhando);
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public boolean getTrabalhando() {
		return trabalhando;
	}
}
