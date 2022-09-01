


import java.util.Scanner;

public class calcall {

    public static void main(String args[]){
        System.out.println("This is my first java calculator programm");
        Scanner firstnum = new Scanner(System.in);
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        double a = firstnum.nextDouble();
       
        System.out.print("\nEnter +-*/ ");
        char c = s.next().charAt(0);   

        System.out.print("\nEnter your 2nd number: ");
        double b= firstnum.nextDouble();
              
        double r;

        if(c=='+'){
            r=a+b;
            System.out.println("Result= "+r);
        }
        
      else if(c=='-'){
        if(a<b){
        r=b-a;
        System.out.println("Result: "+r);
        }
      else{
        r=a-b;
        System.out.println("Result: "+r);
        }   

  }
 else if(c=='*')
   {
        r=a*b;
        System.out.println("Result: "+r);
    }
    else if(c=='/'){
        r=a/b;
        System.out.println("Result: "+r);
    }
    else{
        System.out.println("Enter valid operator");
    }




    }
    
}
