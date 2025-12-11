package rvt;

public class boxTester {
    public static void main(String[] args){
        Box box = new Box(2.5, 5.0, 6.0);
        
        System.out.println("Volume: " + box.volume() + "\nArea: " + box.area());
        System.out.println( "Length: " + box.getLength() + "\nHeight: " + box.getHeight() + "\nWidth:  " + box.getWidth())  ;
        
    }
}
