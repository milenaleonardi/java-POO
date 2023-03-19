
public class Main {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Visitante 1");
		v1.setIdade(35);
		v1.setSexo("F");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Aluno 1");
		a1.setMatricula(1111);
		a1.setCurso("Medicina");
		a1.setIdade(22);
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMensal();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Bolsista 1");
		b1.setMatricula(2222);
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		System.out.println(b1.toString());
		b1.pagarMensal();
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Tecnico 1");
		t1.setMatricula(3333);
		t1.setIdade(20);
		t1.setSexo("M");
		t1.setCurso("Engenharia mecanica");
		t1.setRegProfissional(00005);
		t1.setExp(10);
		System.out.println(t1.toString());
		t1.praticar(t1.getExperiencia());
		
		
		Professor p1 = new Professor();
		p1.setNome("Professor 1");
		p1.setIdade(55);
		p1.setSexo("M");
		p1.setEspecialidade("Biologia");
		p1.setSalario(5000.00f);
		p1.receberAumento(575.25f);
		System.out.println(p1.toString());
	}
}
