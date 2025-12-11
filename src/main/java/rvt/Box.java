package rvt;

public class Box {
    private double height;
    private double width;
    private double length;

    public Box (double height, double width, double length){
        this.width = width;
        this.height = height;
        this.length = length;

    }

    public double volume(){
        return width * height * length;
    }

    public double area(){
        return 2*(width * height * length);
    }
 
    public  double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

}
