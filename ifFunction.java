import java.util.Scanner;

public class ifFunction{
    public static void main(String[] args){
        Scanner ievade = new Scanner(System.in);
        
        System.out.print("Input the cars speed: ");
        double speed = ievade.nextDouble();

        if (speed > 50) {
            System.out.println("Drive slower!");
        }

        else if (speed < 40 ) {
            System.out.println("Drive faster!");
        }

        else if (speed == 50){
            System.out.println("Thank you for going with the rules :)");
        }
    }

}