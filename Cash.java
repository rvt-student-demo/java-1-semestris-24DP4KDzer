import java.util.Scanner;

public class Cash {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Input the sum: ");
            Integer money = scanner.nextInt();

            if (money < 25000){
                if (money >= 5000){
                    double tax = 1.0 *(100 + (money - 5000 ) * 0.08);
                    System.out.println(tax);
                }

            }

            else if (money < 55000){
                if (money >= 25000){
                    double tax = 1.0 *(1700 + (money - 25000 ) * 0.10);
                    System.out.println(tax);
                }
            }

            else if (money < 200000){
                if (money >= 55000){
                    double tax = 1.0 *(4700 + (money - 55000 ) * 0.12);
                    System.out.println(tax);
                }
            }

            else if (money < 1000000){
                if (money >= 200000){
                    double tax = 1.0 *(22100 + (money - 200000 ) * 0.15);
                    System.out.println(tax);
                }
            }


            else{
                if(money >= 1000000){
                    double tax = 1.0 *(142100 + (money - 1000000) * 0.17);
                    System.out.println(tax);
                }
            }

        }
    }
}
