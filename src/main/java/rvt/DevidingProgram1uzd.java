package rvt;
import java.util.Scanner;


public class DevidingProgram1uzd {
    public static void main(String[] args){
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        for (int f = 0; f < amount; f += 1){
            i += 1;
            greet(i);
        }
        
    }

    public static void greet(int i){
        System.out.println("Hello " + i);
    }
}
