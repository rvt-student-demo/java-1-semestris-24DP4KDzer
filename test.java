import java.util.ArrayList;
import java.util.Scanner;

public class test{
    public void Board(){
    ArrayList<String> Row1 = new ArrayList<String>();
    ArrayList<String> Row2 = new ArrayList<String>();
    ArrayList<String> Row3 = new ArrayList<String>();

        for (int i = 0; i < 3; i++){
            Row1.add("_");
            Row2.add("_");
            Row3.add("_");
        }
    System.out.print(Row1 + "\n" + Row2 + "\n" + Row3);
    
    }
    public static void main(String[] args){
        Scanner ievade = new Scanner(System.in);
        
        String Move = ievade.nextLine();

    
        
    }
}