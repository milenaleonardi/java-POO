
public class Main {
	public static void main(String[] args) {
		//Instanciando objeto c
		ControleRemoto c = new ControleRemoto();
		
		//Utilizando métodos
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		
		//Visualização do status atual dos atributos do objeto 'c'
		c.abrirMenu();
		c.fecharMenu();
		
		System.out.prinln("Fim");
	}
}
