
public class Lutador {

	//Atributos
	private String nome, nacionalidade, categoria;
	private int idade;
	private float altura, peso;
	private int vitorias, derrotas, empates;
	
	//Constructor
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	//Métodos
	public void apresentar() {		
		System.out.println("-------APRESENTAÇÃO-------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + "anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando: " + this.getPeso());
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: "+ this.getEmpates());
	}
	
	public void status() {
		System.out.println("------STATUS------");
		System.out.println(this.getNome());
		System.out.println("é um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + "vitórias");
		System.out.println(this.getDerrotas() + "derrotas");
		System.out.println(this.getEmpates()+ "empates");
		
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
	
	//Métodos setters e getters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public float getPeso() {
		return peso;
	}
	
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 72.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (peso <= 120.2){
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public int getEmpates() {
		return empates;
	}
	
}
