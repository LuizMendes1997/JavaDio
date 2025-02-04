package Projeto.FundamentosJava;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoContaBancaria {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
			  i = 2;
		nomes[i] = scanner.nextLine();
	      System.out.println(nomes[i]);
	      i = i++;
		}
}}
	

