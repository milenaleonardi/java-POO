package exemplopratico1;

public class Principal {
	public static void main(String[] args) {
		
		//Instanciando objetos
		ContaBanco conta1 = new ContaBanco(1111, "Cliente1");
		conta1.abrirConta("CC");
		
		ContaBanco conta2 = new ContaBanco(2222, "Cliente2");
		conta2.abrirConta("CP");
		
		//Implementando métodos
		conta1.depositar(100);
		conta2.depositar(500);
		
		conta2.sacar(100);
		conta2.sacar(1000);
		
		conta1.estadoAtual();
		conta2.estadoAtual();
	}
}
