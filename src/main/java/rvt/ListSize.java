package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;   
            }
            list.add(input);
        }

        // Printēt visu
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println("In total: " + list.size());
    }
}

