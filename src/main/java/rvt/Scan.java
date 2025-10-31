import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input message: ");
        
        String message = scanner.nextLine();
        System.out.println("");
        
        //for loop ↓

        for (int i = 1; i <= 3; i++) {
            System.out.println(message);
        }

    }
}
