import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        
        System.out.println("Enter any number:");
        int a=input.nextInt();


        if(a%2==0){

            System.out.print("This is Even number: ");

        }
        else{
            System.out.print("This is Odd number: ");
        }
    }
    
}
