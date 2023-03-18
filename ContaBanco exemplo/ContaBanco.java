package exemplopratico1;

public class ContaBanco {
	
	//Atributos
	public int numConta;
	protected String tipoConta;
	private String nomeCliente;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("---------------------");
		System.out.println("Conta: " + this.numConta);
		System.out.println("Tipo: " + this.tipoConta);
		System.out.println("Nome: " + this.nomeCliente);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
	}
	//Constructor
	public ContaBanco(int n, String c) {
		status = false;;
		this.numConta = n;
		this.nomeCliente = c;
	}
	
	//Métodos
	public void abrirConta(String tipoConta) {
		this.setTipoConta(tipoConta);
		this.setStatus(true);
		if(tipoConta == "CC") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.saldo > 0) {
			System.out.println("Conta possui dinheiro");
		} else if (this.saldo < 0) {
			System.out.println("Conta está em debito");
		} else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float valor) {
		if(this.getStatus()) {
//			saldo += valor;
			this.setSaldo(getSaldo() + valor);
		} else {
			System.out.println("Não foi possivel depositar. Conta inexistente.");
		}
	}
		
	public void sacar(float valor) {
		if(this.getStatus()) {
			if(this.getSaldo() > valor) {
//				saldo -= valor;
				this.setSaldo(getSaldo() - valor);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Não foi possivel sacar. Conta inexistente.");
		}
	}
	
	public void pagarMensal() {
		float valor;
		if(this.tipoConta == "CC") {
			valor = 12;
		} else {
			valor = 20;
		}
		if(this.getStatus()) {
			if(this.saldo > valor) {
				this.setSaldo(getSaldo() - valor);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossivel realizar o pagamento.");
		}
	}
	
	//Métodos setter e getters
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
