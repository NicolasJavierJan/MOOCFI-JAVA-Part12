
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int numbers = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < numbers; i++){
            int random = randomNumber.nextInt(11);
            System.out.println(random);
        }
        
    }

}
