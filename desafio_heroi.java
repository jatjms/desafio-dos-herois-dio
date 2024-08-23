import java.util.Scanner;

public class desafio_heroi {

    public static void main(String[] args){
        try(Scanner heroi = new Scanner(System.in)){
            int nivelXp;
            String name;

            System.out.println("Digite seu Nome:");
            name = heroi.next();

            System.out.println("Digite seu nivel de Xp.");
            nivelXp = heroi.nextInt();

            if(nivel_xp <= 1000){
                System.out.println("O Jogador: "+name+" esta com Nivel Ferro, com o total de "+nivelXp+" XP.");
            }

        }
    }
}
