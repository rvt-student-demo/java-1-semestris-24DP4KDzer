package rvt;

import java.util.Scanner;

public class overloadedCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number from which to start counting! \n>>> ");
        int starts = scanner.nextInt();
        scanner.nextLine();

        

        startValue counter = new startValue(starts);


        while(true){
            System.out.print("Input an action\n(i = increment)\n(d = decrease)\n>>> "); // Can type "D 2" and it will do this equation (number - 2) as it  is the number user gave.
            String darb = scanner.nextLine();
            String[] parts = darb.split(" ");

            String command = parts[0].toLowerCase();
            int amount = 1;

            if(parts.length > 1) amount = Integer.parseInt(parts[1]);


            if (command.equals("i")){
                counter.increment(amount);
                System.out.println("\n" + counter.count + "\n");
            }    
            
            else if(command.equals ("d")){
                counter.decrease(amount);
                System.out.println("\n" + counter.count + "\n");
            }

            else {
                System.out.println("Invalid action!\n\n\n");
                continue;
            }

                try {
                    Thread.sleep(200);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
