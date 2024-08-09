package com.desafioheroi.app;

import java.util.Scanner;

public class desafioheroi {
	 
    public static void main(String[] args){
        try(Scanner heroi = new Scanner(System.in)){
            int nivelXp;
            String name;

            System.out.println("Digite seu Nome:");
            name = heroi.next();

            System.out.println("Digite seu nivel de Xp.");
            nivelXp = heroi.nextInt();

            if(nivelXp <= 1000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Ferro', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 1001 && nivelXp <= 2000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Bronze', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 2001 && nivelXp <= 5000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Prata', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 5001 && nivelXp <= 7000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Ouro', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 7001 && nivelXp <= 8000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Platina', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 8001 && nivelXp <= 9000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Ascendente', com o total de "+nivelXp+" XP.");

            }else if(nivelXp >= 9001 && nivelXp <= 10000){
                System.out.println("O Jogador: "+name+" esta com Nivel 'Imortal', com o total de "+nivelXp+" XP.");

            }else{
                System.out.println("O Jogador: "+name+" esta com Nivel 'Radiante', com o total de "+nivelXp+" XP.");
            }

        }
    }

}
