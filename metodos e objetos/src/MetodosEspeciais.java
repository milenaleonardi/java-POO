
public class MetodosEspeciais {
	public static void main(String[] args) {
		
		NovoCaneta c1 = new NovoCaneta("NIC", "Amarela", 0.4f);
//		c1.setModelo("Bic");
//		c1.setPonta(0.5f);
		
		c1.status();
		
		NovoCaneta c2 = new NovoCaneta("BIC", "Laranja", 1.0f);
		
		c1.status();
	}
}
