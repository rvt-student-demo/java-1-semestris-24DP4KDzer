package rvt;

import java.util.Scanner;

public class SkaitluAnalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int skaits = 0;
        int summa = 0;
        int lielakais = Integer.MIN_VALUE;
        int mazākais = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitīvu skaitli (0 vai negatīvs skaitlis pārtrauc ievadi): ");
            int skaitlis = scanner.nextInt();

            if (skaitlis <= 0) {
                break;
            }

            skaits++;
            summa += skaitlis;

            if (skaitlis > lielakais) {
                lielakais = skaitlis;
            }

            if (skaitlis < mazākais) {
                mazākais = skaitlis;
            }
        }

        if (skaits > 0) {
            double videja = (double) summa / skaits;

            System.out.println("\nIevadīto skaitļu skaits: " + skaits);
            System.out.println("Skaitļu summa: " + summa);
            System.out.println("Vidējā vērtība: " + videja);
            System.out.println("Lielākais skaitlis: " + lielakais);
            System.out.println("Mazākais skaitlis: " + mazākais);
        } else {
            System.out.println("Netika ievadīts neviens pozitīvs skaitlis.");
        }

        scanner.close();
    }
}