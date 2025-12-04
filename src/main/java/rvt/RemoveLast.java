package rvt;

import java.util.ArrayList;

public class RemoveLast {
    public static void removelast(ArrayList<Integer> numbers) {
    if (numbers.size() == 0) {
        return;
    }
    numbers.remove(numbers.size() - 1);
}
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(numbers);
        removelast(numbers);
        System.out.println(numbers);


    }
}
