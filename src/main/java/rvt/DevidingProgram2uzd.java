package rvt;

public class DevidingProgram2uzd {
    
    public static void main(String[] args) {
        int min = 7;
        int max = 25;

        printNumbers(min, max);
        System.out.println();

        min = 23;

        printNumbers(min, max);
    }

    public static void printNumbers(int min, int max) {
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }
}

