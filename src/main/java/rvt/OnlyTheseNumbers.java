package rvt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (true){
            System.out.print("Input numbers for list: ");
            Integer addList = scanner.nextInt();

            if (addList == -1){
                break;
            }
            else{
                numbers.add(addList);
                continue;
            }
        }
        

            while (true){
            System.out.print("From where? ");
            Integer start = scanner.nextInt();

            System.out.print("To where? ");
            Integer end = scanner.nextInt();


            for (int i = start; i-1 < end; i++){
                System.out.println(numbers.get(i));
            }
        }
    }
}
