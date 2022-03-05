import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//ArrayList<String> meusClientes= new ArrayList<>();
	protected int cpf;  
	protected String nome;
	protected int idade;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
