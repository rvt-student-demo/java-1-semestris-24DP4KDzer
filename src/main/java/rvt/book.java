package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class book {
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


        System.out.println("Names: " + name);
        System.out.println("Pages: " + lapas);
        System.out.println("Years: " + gads);
    }
}
