package projetoPessoas;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	@Override
	public String toString() {
		return "\n[Pessoa{nome= " + this.getNome() + 
				"\nidade= " + this.getIdade() + 
				"\nsexo= " + this.getSexo() + "}]";
	}
	
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
