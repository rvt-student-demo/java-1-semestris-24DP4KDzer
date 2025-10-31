package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class testy {
    




    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int p = 1;
        ArrayList<String> row1 = new ArrayList<String>();
        ArrayList<String> row2 = new ArrayList<String>();
        ArrayList<String> row3 = new ArrayList<String>();

        for (int i = 0 ; i < 3; i++ ){
        row1.add("_");
        row2.add("_");
        row3.add("_");
    }
        

        


        while(true){
            
            System.out.println(row1);
            System.out.println(row2);
            System.out.println(row3);



            if (p == 1){
                System.out.print("Player 1\nEnter a row: ");
                int p1row = scanner.nextInt(); 

                System.out.print("Player 1\nEnter a col: ");
                int p1col = scanner.nextInt();

                if (p1row == 1){
                    if (p1col == 1){
                        row1.set(0, "X");
                    }
                    else if(p1col == 2){
                        row1.set(1, "X");
                    }

                    else if(p1col == 3){
                        row1.set(2, "X");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }

                if (p1row == 2){
                    if (p1col == 1){
                        row2.set(0, "X");
                    }
                    else if(p1col == 2){
                        row2.set(1, "X");
                    }

                    else if(p1col == 3){
                        row2.set(2, "X");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }


                if (p1row == 3){
                    if (p1col == 1){
                        row3.set(0, "X");
                    }
                    else if(p1col == 2){
                        row3.set(1, "X");
                    }

                    else if(p1col == 3){
                        row3.set(2, "X");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }



                else{
                        System.out.println("Input a valid option!!");
                    }
                p += 1;



            }


            else {
                System.out.print("Player 2\nEnter a row: ");
                int p2row = scanner.nextInt();

                System.out.print("Player 2\nEnter a col: ");
                int p2col = scanner.nextInt();
                p -= 1;

                if (p2row == 1){
                    if (p2col == 1){
                        row1.set(0, "O");
                    }
                    else if(p2col == 2){
                        row1.set(1, "O");
                    }

                    else if(p2col == 3){
                        row1.set(2, "O");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }

                if (p2row == 2){
                    if (p2col == 1){
                        row2.set(0, "O");
                    }
                    else if(p2col == 2){
                        row2.set(1, "O");
                    }

                    else if(p2col == 3){
                        row2.set(2, "O");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }

                if (p2row == 3){
                    if (p2col == 1){
                        row3.set(0, "O");
                    }
                    else if(p2col == 2){
                        row3.set(1, "O");
                    }

                    else if(p2col == 3){
                        row3.set(2, "O");
                    }
                
                    else{
                        System.out.println("Input a valid option!!");
                    }
                }


            }

        }
    }
}



