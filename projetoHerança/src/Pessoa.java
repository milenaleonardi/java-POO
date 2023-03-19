
public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public String toString() {
		return "\n[Dados{nome= " + this.getNome() +
				" idade= " + this.getIdade() +
				" sexo= " + this.getSexo() + "}]";
	}
	
	public final void fazerAniver() {
		this.setIdade(getIdade() + 1);
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	 public String getNome() {
		return nome;
	}
	 
	 public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	 
	 public String getSexo() {
		return sexo;
	}
}
