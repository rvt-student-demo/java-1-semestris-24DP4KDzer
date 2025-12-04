package rvt;

import java.util.Scanner;

public class PasutijumaParbauditajs {

    private static final int BOLT_PRICE = 5;     
    private static final int NUT_PRICE = 3;      
    private static final int WASHER_PRICE = 1;    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skrūvju skaits: ");
        int skruves = sc.nextInt();

        System.out.print("Uzgriežņu skaits: ");
        int uzgriezni = sc.nextInt();

        System.out.print("Paplāksņu skaits: ");
        int paplaksnes = sc.nextInt();

        // Parbaude
        boolean irKluda = false;

        if (uzgriezni < skruves) {
            System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
            irKluda = true;
        }

        if (paplaksnes < 2 * skruves) {
            System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
            irKluda = true;
        }

        if (!irKluda) {
            System.out.println("Pasūtījums ir kārtībā.");
        }

    
        int kopejaCena = skruves * BOLT_PRICE
                       + uzgriezni * NUT_PRICE
                       + paplaksnes * WASHER_PRICE;

        System.out.println("Kopējā cena: " + kopejaCena);

        sc.close();
    }
}
