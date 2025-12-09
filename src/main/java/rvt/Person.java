package rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }

    // Setters
    public void growOlder() {
        this.age++;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    // BMI
    public double bodyMassIndex() {
        double heightMeters = this.height / 100.0;
        return this.weight / (heightMeters * heightMeters);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
