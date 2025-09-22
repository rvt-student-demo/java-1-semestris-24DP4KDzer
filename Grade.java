import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner atzime = new Scanner(System.in);
        

        System.out.print("Input a grade: ");
        Integer marking = atzime.nextInt();

        if (marking == 100){
            System.out.println("Great You Scored a 100%");
        }

        
        else if (marking >= 90){
            System.out.println("Nice You Scored " + marking + "%");
        }

        
        else if (marking >= 80){
            System.out.println("OOOO You scored " + marking + "%");
        }

        
        else if (marking >= 70){
            System.out.println("Whoops You Scored " + marking + "%");
        }

        
        else if (marking >= 60 ){
            System.out.println("Almost good, You Scored " + marking + "%");
        }

        
        else if (marking >= 50){
            System.out.println("Barely You Scored " + marking + "%");
        }

        else {
            System.out.println("You Failed!! You Scored below 50%");
        }
    }
}
