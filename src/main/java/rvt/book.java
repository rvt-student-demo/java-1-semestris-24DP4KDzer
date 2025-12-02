package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class book {

    public static void printer(){
        System.out.print("What do you want to print?\n'1'= Title\n'2'= Pages\n'3'= Year\n'everything'= everything\n>>> ");

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> lapas = new ArrayList<>();
        ArrayList<Integer> gads = new ArrayList<>();
       
        
 
        System.out.print("Input Book Title: ");
        String title = scanner.nextLine();

        name.add(title);

        System.out.print("Input Book Pages: ");
        Integer pages = scanner.nextInt();
        lapas.add(pages);
        
        System.out.print("Input Book Year: ");
        Integer year = scanner.nextInt();
        gads.add(year);



        printer();

        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println(name);
        } else if (choice.equals("2")) {
            System.out.println(lapas);
        } else if (choice.equals("3")) {
            System.out.println(gads);
        } else if (choice.equals("everything")) {
            System.out.println("Titles: " + name);
            System.out.println("Pages: " + lapas);
            System.out.println("Years: " + gads);
        } else {
            System.out.println("Invalid input.");
        }

    
    }
}
