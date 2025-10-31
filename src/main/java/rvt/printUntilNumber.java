package rvt;

public class printUntilNumber {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        printNumber(x, y);
    }

    public static void printNumber(int x, int y){
        while (x <= y){
            System.out.println(x);
            x++;
        }
    }
}
