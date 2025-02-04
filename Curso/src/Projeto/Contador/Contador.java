package Projeto.Contador;

import java.util.Locale;
import java.util.Scanner;

import Projeto.Candidatura.NumeroMenorQueOutroException;
public class Contador {
	  
	    public static void contar(int num1, int num2) throws NumeroMenorQueOutroException {
	        if (num1 <= num2) {
	          
	            throw new NumeroMenorQueOutroException("O primeiro número deve ser maior que o segundo para contar!");
	        }
	        System.out.println("Contagem de " + num1 + " até " + num2 + ":");
	        for (int i = num1; i >= num2; i--) {
	            System.out.println(i);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	        try {
	            System.out.print("Digite o primeiro número: ");
	            int numero1 = scanner.nextInt();

	            System.out.print("Digite o segundo número: ");
	            int numero2 = scanner.nextInt();
	            contar(numero1, numero2);
	        } catch (NumeroMenorQueOutroException e) {
	            System.err.println("Erro: " + e.getMessage());
	        } catch (Exception e) {
	            System.err.println("Entrada inválida. Por favor, insira números inteiros.");
	        } finally {
	            scanner.close();
	        }
	    }
	}




