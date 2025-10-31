import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?: ");

        String message = scanner.nextLine();

        System.out.println("Hi " + message + "!");
    }
}
