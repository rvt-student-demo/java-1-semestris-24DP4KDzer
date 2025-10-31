package rvt;
import java.util.Scanner;


public class DevidingPrograms {
    public static void main(String[] args){
        Scanner skeneris = new Scanner(System.in);
        

        while (true) {
            System.out.print("Input an action\n>>> ");
            Integer ievade = skeneris.nextInt();

            if (ievade == 1){
                greet();
                break;
            }

            else{
                System.out.println("Input a valid action!!!");
                System.out.println();
            }
        }
       
        
    }

    public static void greet(){
        System.out.println("Hello World From A Divided Program!");
        
    }
}
