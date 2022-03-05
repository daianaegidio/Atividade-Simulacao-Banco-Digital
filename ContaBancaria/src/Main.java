import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> meusClientes= new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		
	
	
		
		int cpf;
		String nome;
		int idade;
		boolean validacao=false;
		
		do {
			System.out.println("Digite uma op��o:");
			System.out.println("1- Cadastrar clientes");
			System.out.println("2- Consultar clientes cadastrados");
			System.out.println("3- Consultar Saldo da Conta Banc�ria");
			System.out.println("4- Depositar na Conta Banc�rias");
			System.out.println("5- Sair");
			int resposta= leitor.nextInt();
			
		switch (resposta) {	
		case 1:
		System.out.println("---Cadastrar Clientes---");
		System.out.println("Digite o CPF:");
		cpf= leitor.nextInt();
		
		System.out.println("Digite o Nome:");
		nome= leitor.next();
		
		System.out.println("Digite sua idade:");
		idade= leitor.nextInt();
		Cliente clientes= new Cliente();
		
		clientes.setCpf(cpf);
		clientes.setNome(nome);
		clientes.setIdade(idade);
		meusClientes.add(clientes);
		 System.out.println(" Cliente Cadastrado Com Sucesso!");
		
		break;
		
		case 2:
			
			if(meusClientes.isEmpty()){
				
				System.out.println("N�o tem Clientes Cadastrados!");
			}else {
		System.out.println("---Clientes Cadastrados---");


		for (int i=0; i < meusClientes.size(); i++) {
			System.out.println("CPF:" + meusClientes.get(i).getCpf());
			System.out.println("Nome:" + meusClientes.get(i).getNome());
			System.out.println("Idade:" + meusClientes.get(i).getIdade());
			System.out.println("-------------------------------------");
			
		}}
		break;
		
		case 3:
			
			boolean vali=false;
			System.out.println("Digite o CPF do Cliente:");
			 int resp1=leitor.nextInt();
			
			for (int i=0; i < meusClientes.size(); i++) {
				
				if(meusClientes.get(i).getCpf()==resp1) {
					 System.out.println("1- Conta Corrente");
					 System.out.println("2- Conta Poupan�a");
					 int tipoConta= leitor.nextInt();
					 if(tipoConta==1) {
					
					Cliente auxiliarClientes= new Cliente();
					auxiliarClientes.setCpf(meusClientes.get(i).getCpf());
					auxiliarClientes.setNome(meusClientes.get(i).getNome());
					auxiliarClientes.setIdade(meusClientes.get(i).getIdade());
					
					Conta cc = new ContaCorrente(auxiliarClientes);
					cc.imprimirExtrato();}
					 
					 if(tipoConta==2) {
						 
							Cliente auxiliarCliente= new Cliente();
							auxiliarCliente.setCpf(meusClientes.get(i).getCpf());
							auxiliarCliente.setNome(meusClientes.get(i).getNome());
							auxiliarCliente.setIdade(meusClientes.get(i).getIdade());
							
							Conta contaPoup = new ContaPoupanca(auxiliarCliente);
							contaPoup.imprimirExtrato();
					 }
					vali=true;}
				if(vali==false) {System.out.println("N�o Possui Conta associada ao CPF Digitado!");}
			}
			break;
			
		case 4:
			System.out.println("Digite o CPF do Cliente:");
			 int resp2=leitor.nextInt();
			 
			 for (int i=0; i < meusClientes.size(); i++) {
					
					if(meusClientes.get(i).getCpf()==resp2) {
						
						System.out.println("1- Conta Corrente");
						 System.out.println("2- Conta Poupan�a");
						 int tipoConta= leitor.nextInt();
						 
						 System.out.println("Qual o valor deseja Depositar");
						 double valor=leitor.nextDouble();
						 if(tipoConta==1) {
						
						Cliente auxiliarCliente1= new Cliente();
						auxiliarCliente1.setCpf(meusClientes.get(i).getCpf());
						auxiliarCliente1.setNome(meusClientes.get(i).getNome());
						auxiliarCliente1.setIdade(meusClientes.get(i).getIdade());
						
						Conta cc1 = new ContaCorrente(auxiliarCliente1);
						cc1.depositar(valor);}
						 
						 if(tipoConta==2) {
							 
								Cliente auxiliarCliente2= new Cliente();
								auxiliarCliente2.setCpf(meusClientes.get(i).getCpf());
								auxiliarCliente2.setNome(meusClientes.get(i).getNome());
								auxiliarCliente2.setIdade(meusClientes.get(i).getIdade());
								
								Conta contaPoup1 = new ContaPoupanca(auxiliarCliente2);
								contaPoup1.depositar(valor);
						 }
					}
					
			 }
			
			break;
			
	
		case 5:
			
			System.out.println("Sistema Finalizado!");
			validacao=true;
			break;
			
		default:
	           System.out.println ("Digite um n�mero v�lido!");
		}
		
		
		}while(!validacao);
		
		
	
	}

}
