
import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double base, hight, area;


        System.out.print("Enter your triangle base: " );

        base=input.nextDouble();


        System.out.print("Enter your triangle hight: ");

        hight=input.nextDouble();

        
        area= 0.5*base*hight;

        System.out.print("Triangle area: "+area);


        

    }
    
}
