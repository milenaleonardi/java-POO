package projetoPessoas;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public void cancelarMat() {
		System.out.println("Matricula de " + this.getNome() + " será cancelada.");
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
