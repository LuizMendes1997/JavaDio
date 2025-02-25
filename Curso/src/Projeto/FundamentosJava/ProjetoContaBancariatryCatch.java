package Projeto.FundamentosJava;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoContaBancariatryCatch {
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		String nome; double saldo; String agencia; int numero;
		
		System.out.println("Digite seu nome:" );
		nome = scanner.next();
		
		System.out.println("Digite a sua agencia:");
		agencia = scanner.next();
		
		System.out.println("Digite o numero da sua agencia:");
		numero = Integer.parseInt(scanner.next());
		
		System.out.println("Digite o saldo da sua conta:");
		saldo = Double.parseDouble(scanner.next());
		
		System.out.println("Ola " + nome +" obrigado por criar uma conta em nosso banco, sua agencia é " + agencia+", conta "+numero+" e seu saldo " +saldo+" ja está disponivel para saque.");
	
		}
		catch(NumberFormatException e){
			System.err.println("Os campos numero e saldo precisam ser numericos.");
		}
		
	}
}
