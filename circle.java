import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double radius, area;


        System.out.print("Enter your circle radius:   " );

        radius=input.nextDouble();

        area=3.1416*radius*radius;

        System.out.print("Circle area is "+area);
        

    }
    
}
