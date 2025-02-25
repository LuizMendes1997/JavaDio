package Projeto.Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizada = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu= atender();
			continuarTentando= !atendeu;
			if(continuarTentando) {
				tentativasRealizada++;
			}
		}while(continuarTentando && tentativasRealizada <3);
		if(atendeu) {
			System.out.println("Contato realizado com o " + candidato + " na " + tentativasRealizada +" tentativa");
		}
		else {
			System.out.println("Contato nao realizado com o " + candidato);
		}
	
	
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void selecaoCandidato() {
		String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniel","Jorge"};
		int candidatosSelecionados =0;
		int candidatoAtual =0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato "+candidato+ "solicitou este valor R$ "+salarioPretendido);
			if(salarioBase> salarioPretendido) {
				System.out.println("O candidato "+candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2000);	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para nosso candidato");
		}
		else if(salarioBase==salarioPretendido){
			System.out.println("Ligar com uma contraproposta");
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
