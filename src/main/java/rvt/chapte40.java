package rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class chapte40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>(
        Arrays.asList("Camry","Camaro", "Benz", "Caprice", "Sonata"));


        System.out.print("Input a car class from the following:\n[Camry, Camaro, Benz,\nCaprice, Sonata]\nEnter your choice here: ");
        String ievade = scanner.nextLine();

        if (ievade == "Camry"){
            System.out.println("Year: 1995\nMake: Camry\nModel: S-line");
        }
        
        if (ievade == "Camaro"){
            System.out.println("Year: 1995\nMake: Camaro\nModel: S-line");
        }

        if (ievade == "Benz"){
            System.out.println("Year: 1995\nMake: Benz\nModel: S-line");
        }
        
        if (ievade == "Caprice"){
            System.out.println("Year: 1995\nMake: Caprice\nModel: S-line");
        }

        if (ievade == "Sonata"){
            System.out.println("Year: 1995\nMake: Sonata\nModel: S-line");
        }

        else{
            System.out.println("Learn to write!!");
        }
    }




}
