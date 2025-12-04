package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        int start, end;

  
        while (true) {
            System.out.print("From where? ");
            start = Integer.parseInt(scanner.nextLine());
            if (start >= 0 && start < numbers.size()) {
                break;
            } else {
                System.out.println("Invalid index. Please enter a number between 0 and " + (numbers.size() - 1));
            }
        }

    
        while (true) {
            System.out.print("To where? ");
            end = Integer.parseInt(scanner.nextLine());
            if (end >= start && end < numbers.size()) {
                break;
            } else {
                System.out.println("Invalid index. Please enter a number between " + start + " and " + (numbers.size() - 1));
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.println(numbers.get(i));
        }

        scanner.close();
    }
}
