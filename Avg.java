import java.util.Scanner;

public class Avg {
    public static void main(String[] args){
        Scanner ievade = new Scanner(System.in);

        System.out.println("Input your 1st number: ");
        double sk1 = ievade.nextDouble();

        System.out.println("Input your 2nd number: ");
        double sk2 = ievade.nextDouble();

        System.out.println("Input your 3rd number: ");
        double sk3 = ievade.nextDouble();

        System.out.println((sk1 + sk2 + sk3) / 3);
    }
}