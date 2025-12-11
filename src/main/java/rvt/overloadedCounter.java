package rvt;

import java.util.Scanner;

public class overloadedCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number from which to start counting! \n>>> ");
        int starts = scanner.nextInt();

        startValue counter = new startValue(starts);

        while(true){
            counter.increment();
            System.out.println(counter.count);

            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    

    
}
