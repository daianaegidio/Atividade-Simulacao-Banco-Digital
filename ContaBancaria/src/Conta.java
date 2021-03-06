
public abstract class Conta  implements IConta  {

	private static final int Agencia_Padrao= 772;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static int sequencial=1;
	public Conta(Cliente cliente) {
		
		this.agencia=Conta.Agencia_Padrao;
		this.numero= sequencial++;
		this.cliente=cliente;
	}
	
	public void sacar(double valor) {
		
		saldo -= valor;
	}
	
	public void depositar(double valor) {
	

		saldo += valor;
	}
	
	public void transferir(double valor, IConta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void sacar() {}
	public void depositar() {}
	public void transferir() {}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
