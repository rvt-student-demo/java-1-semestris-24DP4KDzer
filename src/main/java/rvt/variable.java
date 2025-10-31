import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi Produktu Skaitu: ");
        int value = Integer.valueOf(scanner.nextLine());

        System.out.print("Ievadi Produkta Nosakukumu: ");
        String nosaukums = scanner.nextLine();
        
        System.out.print("Ievadi Produkta Cenu: ");
        double cena = Double.valueOf(scanner.nextLine());
        
        

        System.out.println();
        System.out.println
        ("Produkts: " + nosaukums + 
        "\nCena: " + cena + " EUR" + 
        "\nPieejamais daudzums: " + value +
        "\nKopeja cena: " + (value * cena));


    }
}
