package projetoLivro;

public class Pessoa{

	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
	}
	
	public Pessoa(String n, int id, String s) {
		this.setNome(n);
		this.setIdade(id);
		this.setSexo(s);
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
