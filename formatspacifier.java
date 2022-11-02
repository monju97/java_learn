
import java.util.Scanner;
public class formatspacifier {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
             System.out.print("Enter your CGPA: ");
            double a=input.nextDouble();

        if(a<3){

            System.out.print("You are fail");

        }
        else{

            System.out.printf("\"hurray\" you are passed!!! your CGPA is %.2f",a);
        }

        
        


    }
    
}
