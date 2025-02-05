package Projeto.Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		if(cliente.getIdade() > 18) {
			System.out.println("=== Extrato Conta Poupan�a ===");
			super.imprimirInfosComuns();
			}
			else {
				System.out.println("=== Conta Corrente nao permitida para menores de  === 18 anos");

			}}
	
}
