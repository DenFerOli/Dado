import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random randomDice = new Random();
        
        int dice, num;
        dice = randomDice.nextInt(6);

        System.out.println("Escolha um numero de 1 a 6: ");
        num = sc.nextInt();
        System.out.println("------------------------------");
        System.out.println("\nDado: " + dice);

        if (num == dice) {
            System.out.println("\nPARABÉNS! VOCÊ ACERTOU!");
        } else if (num > 6){
            System.out.println("\nERRO! VALOR INVÁLIDO.");
        } else {
            System.out.println("\nVOCÊ ERROU!\n");
        }
        System.out.println("------------------------------");

        sc.close();
    }
}
