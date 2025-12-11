package rvt;

public class startValue {
    public int count;

    public startValue(int start){
        this.count = start;
    }

    public void increment(int amount){
        count += amount;
    }

    public void decrease(int amount){
        count -= amount;
    }

}
