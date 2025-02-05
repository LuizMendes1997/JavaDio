package Projeto.Banco;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setIdade(18);
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		poupanca.depositar(100);
	
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
