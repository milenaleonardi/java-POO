package projetoLivro;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	@Override
	public String toString() {
		return "\n[Livro{titulo= " + this.titulo + 
				"\nautor= " + this.autor +
				"\ntotalPáginas= " + this.totalPaginas +
				"\npagAtual= " + this.pagAtual +
				"\naberto= " + this.aberto +
				"\nleitor= " + this.leitor.getNome() + 
			 "\nidade= " + this.leitor.getIdade() + 
			 "\nsexo= " + this.leitor.getSexo() + "}]";
	}
	
	public Livro(String t, String a, int pag, Pessoa p) {
		this.titulo = t;
		this.autor = a;
		this.totalPaginas = pag;
		this.leitor = p;
		this.aberto = false;
		this.pagAtual = 0;
	}
	

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean getAberto(){
		return aberto;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	public void folhear(int p) {
		if (p > this.totalPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

	@Override
	public void folhear() {
		// TODO Auto-generated method stub
		
	}
	
}
