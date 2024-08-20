package com.desafioranking.app;

import java.util.Scanner;

public class rakingProject {
	/*
		Se vitórias for menor do que 10 = Ferro
		Se vitórias for entre 11 e 20 = Bronze
		Se vitórias for entre 21 e 50 = Prata
		Se vitórias for entre 51 e 80 = Ouro
		Se vitórias for entre 81 e 90 = Diamante
		Se vitórias for entre 91 e 100= Lendário
		Se vitórias for maior ou igual a 101 = Imortal
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int pontosVitorias;
			
			System.out.println("Quantas vitórias foram concluidas nesta rodada do jogo.");
			pontosVitorias = scan.nextInt();
			
			if(pontosVitorias <= 10) {
				System.out.println("Seu Nível é 'Ferro'.");
				
			}else if(pontosVitorias > 10 && pontosVitorias <= 20 ){
				System.out.println("Seu Nível é 'Bronze'.");
				
			}else if(pontosVitorias >= 21 && pontosVitorias <= 50){
				System.out.println("Seu Nivel é 'Prata'.");
				
			}else if(pontosVitorias >= 51 && pontosVitorias <= 80) {
				System.out.println("Seu Nivel é 'Ouro'.");
				
			}else if(pontosVitorias >= 81 && pontosVitorias <= 90) {
				System.out.println("Seu Nivel é 'Diamante'.");
				
			}else if(pontosVitorias >= 91 && pontosVitorias <= 100) {
				System.out.println("Seu Nivel é 'Lendário'.");
				
			}else if(pontosVitorias >=101) {
				System.out.println("Seu Nivel é 'Imortal'.");
				
			}else {
				System.out.println("Fim de Jogo.");
			}
		}
	}

}
