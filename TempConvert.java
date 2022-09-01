import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args){

double celc, Farh;

Scanner input=new Scanner (System.in);

// System.out.print("Enter todays Temp in celsius= " );

// celc=input.nextDouble();

// Farh=1.8*celc+32;

// System.out.println("result is: "+Farh+" F\n");


System.out.print("Enter todays TEMP In Farhenheit: ");

Farh=input.nextDouble();
celc=0.56*(Farh-32);

System.out.printf("\nresult is: %.2f",celc,'c');



    }
    
}
