
import java.util.Scanner;

public class xy {

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);

        System.out.println("Input your 1st no");

                int x=s.nextInt();

        System.out.println("Input your 2nd no");

        int y=s.nextInt();
    
        int temp =x;
        x=y;
        y=temp;

      

        System.out.println(x); 
        System.out.println(y); 


        
    }
    
}
